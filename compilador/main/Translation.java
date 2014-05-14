package compilador.main;

import compilador.analysis.*;
import compilador.node.*;

class Translation extends DepthFirstAdapter
{
	public void caseTNumber(TInteiro node)
	{// When we see a number, we print it.
		System.out.print(node);
	}
	
	public void outAPlusExpr(AMaisExpr node)
	{// out of alternative {plus} in Expr, we print the plus.
		System.out.print(node.getMais());
	}
	
	public void outAMinusExpr(AMenosExpr node)
	{// out of alternative {minus} in Expr, we print the minus.
		System.out.print(node.getMenos());
	}
	
	public void outAMultFactor(AMultiplicacaoFator node)
	{// out of alternative {mult} in Factor, we print the mult.
		System.out.print(node.getMultiplicacao());
	}

	public void outADivFactor(ADivisaoFator node)
	{// out of alternative {div} in Factor, we print the div.
		System.out.print(node.getDivisao());
	}

	public void outAModFactor(ARestoFator node)
	{// out of alternative {mod} in Factor, we print the mod.
		System.out.print(node.getResto());
	}
}