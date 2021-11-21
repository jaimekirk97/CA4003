import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;

public class SemanticAsgnVisitor extends assignBaseVisitor<Boolean>
{
	private static String scope;
  	SymbolTable symbolTable = new SymbolTable();
  	private ArrayList<String> uncalledFunc = new ArrayList<>();
  	String[] types = {"Assign", "Boolean", "Integer"};

  	@Override 
  	public Boolean visitProg(assignParser.ProgContext ctx) 
  	{ 
  		scope = "global";
  		if (uncalledFunc.size() > 0)
  		{
  			//if uncalled functions added to list
  			System.out.println("Error: Not all functions called");
  		}
  	 	return visitChildren(ctx); 
  	}

	@Override
  	public Boolean visitAssignStm(assignParser.AssignStmContext ctx)
  	{
  	 	String id = ctx.ID().getText();

  	 	//check for existing assignment with id
  	 	SymbolTableEntry entry = (SymbolTableEntry) symbolTable.get(id);
  	 	if(!id.equalsIgnoreCase(entry.id))
  	 	{
  	 		//if id hasn't been declared
  	 		System.out.println("Error: " + id + " not declared before use");
  	 	}
  	 	return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitDecl_lst(assignParser.Decl_lstContext ctx) 
  	{ 
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitFunc_lst(assignParser.Func_lstContext ctx) 
  	{ 
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitPara_lst(assignParser.Para_lstContext ctx) 
  	{ 
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitNemp_paralst(assignParser.Nemp_paralstContext ctx) 
  	{ 
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitMain(assignParser.MainContext ctx) 
  	{ 
  		scope = "main";
  		return visitChildren(ctx); 
  	}

  	@Override 
  	public Boolean visitConst_decl(assignParser.Const_declContext ctx) 
  	{ 
  		String id = ctx.ID().getText();
  		String type = ctx.type().getText();

  		//check for existing constant with id
  		SymbolTableEntry entry = (SymbolTableEntry) symbolTable.get(id);
  		if (id.equals(entry.id) && scope.equals(entry.scope))
  		{
  			//if it exists already
  			System.out.println("Error: " + id + " already declared in scope");
  		}
  		else 
  		{
  			//if no existing constant exists
  			symbolTable.put(id,type,scope);
  		}
  		return visitChildren(ctx);
  	}

  	@Override 
  	public Boolean visitVar_decl(assignParser.Var_declContext ctx) 
  	{ 
  		String id = ctx.ID().getText();
  		String type = ctx.type().getText();

  		//check for existing variable with id
  		SymbolTableEntry variable = (SymbolTableEntry) symbolTable.get(id);
  		if (id.equals(variable.id) && scope.equals(variable.scope))
  		{
  			//if it exists already
  			System.out.println("Error: " + id + " already declared in scope");
  		} else {
  			//if no existing variable exists
  			symbolTable.put(id,type,scope);
  		}
  		return visitChildren(ctx);
  	}

  	@Override 
  	public Boolean visitFunc(assignParser.FuncContext ctx) 
  	{ 
  		symbolTable.openScope();

  		if(ctx.para_lst().nemp_paralst() != null)
  		{
  			List<TerminalNode> lstIds = ctx.para_lst().nemp_paralst().ID();
  			List<assignParser.TypeContext> lstTypes = ctx.para_lst().nemp_paralst().type();
  			//Iterate through both lists
  			Iterator<TerminalNode> iterID = lstIds.iterator();
  			Iterator<assignParser.TypeContext> iterTypes = lstTypes.iterator();

  			while(iterID.hasNext() && iterTypes.hasNext())
  			{
  				symbolTable.put(String.valueOf(iterID.next()), iterTypes.next().getText(), "function_param: " + ctx.ID().getText());
  			}
  		}
  		return visitChildren(ctx);
  	}

  	@Override 
  	public Boolean visitArglst(assignParser.ArglstContext ctx) 
  	{ 
  		return visitChildren(ctx);
   	}

  	@Override 
  	public Boolean visitNemp_arglst(assignParser.Nemp_arglstContext ctx) 
  	{ 
  		return visitChildren(ctx);
  	}

  	@Override 
  	public Boolean visitStmblock(assignParser.StmblockContext ctx) 
  	{ 
  		return visitChildren(ctx); 
  	}
}