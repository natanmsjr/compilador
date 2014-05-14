package compilador.main;

import compilador.lexer.Lexer;
 //import compilador.lexer.Lexer.State;
import compilador.node.*;
import compilador.lexer.LexerException;

public class MyLexer extends Lexer
{
	private int count;
	private TComment comment;
	private StringBuffer text;
	// We define a constructor
	public MyLexer(java.io.PushbackReader in)
	{
		super(in);
	}
	// We define a filter that recognizes nested comments.
	protected void filter()
	{ // if we are in the comment state
		if(state.equals(State.COMMENT))
		{ // if we are just entering this state
			if(comment == null)
			{ // The token is supposed to be a comment.
				// We keep a reference to it and set the count to one
				comment = (TComment) token;
				text = new StringBuffer(comment.getText());
				count = 1;
				token = null; // continue to scan the input.
			}
		else
		{ // we were already in the comment state
			text.append(token.getText()); // accumulate the text.
			if(token instanceof TComment)
				count++;
			else if(token instanceof TCommentFim)
				count--;
			if(count != 0)
			{
				/*if (token instanceof EOF){
					throw new LexerException(null, "comentario");
					//throw new LexerException(null, "Unknown Token '"+comment+"' ["+comment.getLine()+", "+comment.getPos()+"].");
			 	}
				token = null; // continue to scan the input.*/
			}
			else
			{
				comment.setText(text.toString());
				token = comment; //return a comment with the full text.
				state = State.NORMAL; //go back to normal.
				comment = null; // We release this reference.
			}
		}
		}
	}
}