import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class AssignEvalVisitor extends assignBaseVisitor<Boolean>
{
	Scanner sc = new Scanner (System.in);
	Map<String,Boolean> memory = new HashMap<String, Boolean> ();

	@Override
	public Boolean visitAssignStm (assignParser.AssignStmContext ctx)
	{
		String id = ctx.ID().getText();
		Boolean value = visit (ctx.expr());
		memory.put(id,value);
		return value;
	}

	@Override
	public Boolean visitArgStm (assignParser.ArgStmContext ctx)
	{
		
	}

	@Override
	public Boolean visitNegCond (assignParser.NegCondContext ctx)
	{
		Boolean value = visit(ctx.cond());
		return (!value);
	}

	@Override
	public Boolean visitExprOp (assignParser.ExprOpContext ctx)
	{
		return visit(ctx.expr());
	}
}