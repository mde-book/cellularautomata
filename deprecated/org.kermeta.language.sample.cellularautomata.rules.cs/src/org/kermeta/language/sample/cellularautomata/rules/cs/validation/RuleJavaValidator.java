package org.kermeta.language.sample.cellularautomata.rules.cs.validation;

import org.eclipse.xtext.validation.Check;

import rule.CellularAutomata;
import rule.Rule;
import rule.RulePackage;
 

public class RuleJavaValidator extends AbstractRuleJavaValidator {
	
	@Check
	public void checkOverlappingRuleRanges(Rule r1) {
		CellularAutomata ca = (CellularAutomata) r1.eContainer();
		
		if (r1.getFilter().getLowerRange() == Integer.MIN_VALUE && r1.getFilter().getUpperRange() == Integer.MAX_VALUE) {
			if (ca.getRules().size() != 1) {
				error("A cellular automata with an universal rule cannot contain other rules.", RulePackage.Literals.RULE__FILTER);
			}
		}
		else {
			for (Rule r2 : ca.getRules()) {
				if (r2 != r1) {
					if (
							(r2.getFilter().getLowerRange() >= r1.getFilter().getLowerRange() && r2.getFilter().getLowerRange() <= r1.getFilter().getUpperRange())
							||
							(r2.getFilter().getUpperRange() >= r1.getFilter().getLowerRange() && r2.getFilter().getUpperRange() <= r1.getFilter().getUpperRange())
						) {
						error("Range " + r1.getFilter().toString() + " conflicts with range " + r2.getFilter().toString() + "." , RulePackage.Literals.RULE__FILTER);
					}
				}
			}
		}
	}
	
	@Check
	public void checkInversedRuleRanges(Rule r) {
		if (r.getFilter().getLowerRange() > r.getFilter().getUpperRange()) {
			error("The lower bound of a range cannot be greater than the upper bound.", RulePackage.Literals.RULE__FILTER);
		}
	}
}
