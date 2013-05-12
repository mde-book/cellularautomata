package org.kermeta.language.sample.cellularautomata.rules.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.xtext.diagnostics.IDiagnosticProducer;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.INode;

import rule.NeighborsExpression;
import rule.PopulationRange;
import rule.Rule;
import rule.RuleFactory;

import com.google.common.collect.Multimap;

public class CARuleLinker extends LazyLinker {
	
	@Override
	protected void installProxies(EObject obj, IDiagnosticProducer producer,
			Multimap<Setting, INode> settingsToLink) {
		
		super.installProxies(obj, producer, settingsToLink);
		
		/*
		 * Initializing void rule filters
		 */
		if (obj instanceof Rule) {
			if (obj.eGet(obj.eClass().getEStructuralFeature("filter")) == null) {
				obj.eSet(obj.eClass().getEStructuralFeature("filter"), initializeNewRange());
			}
		}
		
		/*
		 * Initializing void neighbor expressions filters
		 */
		if (obj instanceof NeighborsExpression) {
			if (obj.eGet(obj.eClass().getEStructuralFeature("neighborsFilter")) == null) {
				obj.eSet(obj.eClass().getEStructuralFeature("neighborsFilter"), initializeNewRange());
			}
		}
	}
	
	private PopulationRange initializeNewRange() {
		PopulationRange pr = RuleFactory.eINSTANCE.createPopulationRange();
		pr.setLowerRange(Integer.MIN_VALUE);
		pr.setUpperRange(Integer.MAX_VALUE);
		return pr;
	}

}
