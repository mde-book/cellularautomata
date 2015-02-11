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
		
	public  String visitIntegerExpression(IntegerExpression expression);
	public  String visitBinaryExpression(BinaryExpression expression);
	public  String visitUnaryExpression(UnaryExpression expression);
	public  String visitAnd(And expression);
	public  String visitAdd(Add expression);
	public  String visitConditional(Conditional expression);
	public  String visitDiv(Div expression);
	public  String visitEqual(Equal expression);
	public  String visitFilter(Filter filter);
	public  String visitGreater(Greater expression);
	public  String visitIntegerLiteral(IntegerLiteral expression);
	public  String visitLower(Lower expression);
	public  String visitMinus(Minus expression);
	public  String visitMod(Mod expression);
	public  String visitMult(Mult expression);
	public  String visitNot(Not expression);
	public  String visitOr(Or expression);
	public  String visitRule(Rule rule);
	public  String visitUMinus(UMinus expression);
} 
