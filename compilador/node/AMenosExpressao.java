/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMenosExpressao extends PExpressao
{
    private PTermo _termo_;
    private TMenos _menos_;
    private PExpressao _expressao_;

    public AMenosExpressao()
    {
        // Constructor
    }

    public AMenosExpressao(
        @SuppressWarnings("hiding") PTermo _termo_,
        @SuppressWarnings("hiding") TMenos _menos_,
        @SuppressWarnings("hiding") PExpressao _expressao_)
    {
        // Constructor
        setTermo(_termo_);

        setMenos(_menos_);

        setExpressao(_expressao_);

    }

    @Override
    public Object clone()
    {
        return new AMenosExpressao(
            cloneNode(this._termo_),
            cloneNode(this._menos_),
            cloneNode(this._expressao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenosExpressao(this);
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    public TMenos getMenos()
    {
        return this._menos_;
    }

    public void setMenos(TMenos node)
    {
        if(this._menos_ != null)
        {
            this._menos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menos_ = node;
    }

    public PExpressao getExpressao()
    {
        return this._expressao_;
    }

    public void setExpressao(PExpressao node)
    {
        if(this._expressao_ != null)
        {
            this._expressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termo_)
            + toString(this._menos_)
            + toString(this._expressao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        if(this._menos_ == child)
        {
            this._menos_ = null;
            return;
        }

        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        if(this._menos_ == oldChild)
        {
            setMenos((TMenos) newChild);
            return;
        }

        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
