/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpressaoLogica extends PExpressaoLogica
{
    private TNumero _numero_;

    public AExpressaoLogica()
    {
        // Constructor
    }

    public AExpressaoLogica(
        @SuppressWarnings("hiding") TNumero _numero_)
    {
        // Constructor
        setNumero(_numero_);

    }

    @Override
    public Object clone()
    {
        return new AExpressaoLogica(
            cloneNode(this._numero_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressaoLogica(this);
    }

    public TNumero getNumero()
    {
        return this._numero_;
    }

    public void setNumero(TNumero node)
    {
        if(this._numero_ != null)
        {
            this._numero_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numero_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numero_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numero_ == child)
        {
            this._numero_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numero_ == oldChild)
        {
            setNumero((TNumero) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}