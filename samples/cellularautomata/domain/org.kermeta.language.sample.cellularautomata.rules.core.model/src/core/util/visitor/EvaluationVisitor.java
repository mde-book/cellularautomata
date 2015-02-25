/**
 */
package core.util.visitor;

import core.Add;
import core.And;
import core.BinaryExpression;
import core.Conditional;
import core.Div;
import core.Equal;
import core.Filter;
import core.Greater;
import core.IntegerExpression;
import core.IntegerLiteral;
import core.Lower;
import core.Minus;
import core.Mod;
import core.Mult;
import core.Not;
import core.Or;
import core.Rule;
import core.UMinus;
import core.UnaryExpression;

/**
 * 
 */
public interface EvaluationVisitor {
		
	int visitIntegerExpression(IntegerExpression expression);
	int visitBinaryExpression(BinaryExpression expression);
	int visitUnaryExpression(UnaryExpression expression);
	int visitAnd(And expression);
	int visitAdd(Add expression);
	int visitConditional(Conditional expression);
	int visitDiv(Div expression);
	int visitEqual(Equal expression);
	int visitFilter(Filter filter);
	int visitGreater(Greater expression);
	int visitIntegerLiteral(IntegerLiteral expression);
	int visitLower(Lower expression);
	int visitMinus(Minus expression);
	int visitMod(Mod expression);
	int visitMult(Mult expression);
	int visitNot(Not expression);
	int visitOr(Or expression);
	int visitRule(Rule rule);
	int visitUMinus(UMinus expression);
} 
