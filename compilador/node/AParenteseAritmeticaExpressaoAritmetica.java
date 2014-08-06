/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AParenteseAritmeticaExpressaoAritmetica extends PExpressaoAritmetica
{
    private PExpressaoAritmetica _expressaoAritmetica_;

    public AParenteseAritmeticaExpressaoAritmetica()
    {
        // Constructor
    }

    public AParenteseAritmeticaExpressaoAritmetica(
        @SuppressWarnings("hiding") PExpressaoAritmetica _expressaoAritmetica_)
    {
        // Constructor
        setExpressaoAritmetica(_expressaoAritmetica_);

    }

    @Override
    public Object clone()
    {
        return new AParenteseAritmeticaExpressaoAritmetica(
            cloneNode(this._expressaoAritmetica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParenteseAritmeticaExpressaoAritmetica(this);
    }

    public PExpressaoAritmetica getExpressaoAritmetica()
    {
        return this._expressaoAritmetica_;
    }

    public void setExpressaoAritmetica(PExpressaoAritmetica node)
    {
        if(this._expressaoAritmetica_ != null)
        {
            this._expressaoAritmetica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoAritmetica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoAritmetica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoAritmetica_ == child)
        {
            this._expressaoAritmetica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoAritmetica_ == oldChild)
        {
            setExpressaoAritmetica((PExpressaoAritmetica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}