/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TBarra extends Token
{
    public TBarra()
    {
        super.setText("|");
    }

    public TBarra(int line, int pos)
    {
        super.setText("|");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBarra(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBarra(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBarra text.");
    }
}
