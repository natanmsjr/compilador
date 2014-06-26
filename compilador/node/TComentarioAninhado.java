/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TComentarioAninhado extends Token
{
    public TComentarioAninhado()
    {
        super.setText("/*");
    }

    public TComentarioAninhado(int line, int pos)
    {
        super.setText("/*");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentarioAninhado(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentarioAninhado(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComentarioAninhado text.");
    }
}