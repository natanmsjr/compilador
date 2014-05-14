/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TEou extends Token
{
    public TEou()
    {
        super.setText("eou");
    }

    public TEou(int line, int pos)
    {
        super.setText("eou");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEou(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEou(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEou text.");
    }
}