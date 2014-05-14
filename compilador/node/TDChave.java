/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TDChave extends Token
{
    public TDChave()
    {
        super.setText("}");
    }

    public TDChave(int line, int pos)
    {
        super.setText("}");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDChave(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDChave(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDChave text.");
    }
}