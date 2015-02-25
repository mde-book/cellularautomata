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
public interface CoreModelToTextVisitor {
		
	String visitIntegerExpression(IntegerExpression expression);
	String visitBinaryExpression(BinaryExpression expression);
	String visitUnaryExpression(UnaryExpression expression);
	String visitAnd(And expression);
	String visitAdd(Add expression);
	String visitConditional(Conditional expression);
	String visitDiv(Div expression);
	String visitEqual(Equal expression);
	String visitFilter(Filter filter);
	String visitGreater(Greater expression);
	String visitIntegerLiteral(IntegerLiteral expression);
	String visitLower(Lower expression);
	String visitMinus(Minus expression);
	String visitMod(Mod expression);
	String visitMult(Mult expression);
	String visitNot(Not expression);
	String visitOr(Or expression);
	String visitRule(Rule rule);
	String visitUMinus(UMinus expression);
} 
