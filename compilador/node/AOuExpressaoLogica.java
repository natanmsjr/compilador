/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AOuExpressaoLogica extends PExpressaoLogica
{
    private PExpressaoRelacional _expressaoRelacional_;
    private TOu _ou_;
    private PExpressaoLogica _expressaoLogica_;

    public AOuExpressaoLogica()
    {
        // Constructor
    }

    public AOuExpressaoLogica(
        @SuppressWarnings("hiding") PExpressaoRelacional _expressaoRelacional_,
        @SuppressWarnings("hiding") TOu _ou_,
        @SuppressWarnings("hiding") PExpressaoLogica _expressaoLogica_)
    {
        // Constructor
        setExpressaoRelacional(_expressaoRelacional_);

        setOu(_ou_);

        setExpressaoLogica(_expressaoLogica_);

    }

    @Override
    public Object clone()
    {
        return new AOuExpressaoLogica(
            cloneNode(this._expressaoRelacional_),
            cloneNode(this._ou_),
            cloneNode(this._expressaoLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOuExpressaoLogica(this);
    }

    public PExpressaoRelacional getExpressaoRelacional()
    {
        return this._expressaoRelacional_;
    }

    public void setExpressaoRelacional(PExpressaoRelacional node)
    {
        if(this._expressaoRelacional_ != null)
        {
            this._expressaoRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoRelacional_ = node;
    }

    public TOu getOu()
    {
        return this._ou_;
    }

    public void setOu(TOu node)
    {
        if(this._ou_ != null)
        {
            this._ou_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ou_ = node;
    }

    public PExpressaoLogica getExpressaoLogica()
    {
        return this._expressaoLogica_;
    }

    public void setExpressaoLogica(PExpressaoLogica node)
    {
        if(this._expressaoLogica_ != null)
        {
            this._expressaoLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoLogica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressaoRelacional_)
            + toString(this._ou_)
            + toString(this._expressaoLogica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressaoRelacional_ == child)
        {
            this._expressaoRelacional_ = null;
            return;
        }

        if(this._ou_ == child)
        {
            this._ou_ = null;
            return;
        }

        if(this._expressaoLogica_ == child)
        {
            this._expressaoLogica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressaoRelacional_ == oldChild)
        {
            setExpressaoRelacional((PExpressaoRelacional) newChild);
            return;
        }

        if(this._ou_ == oldChild)
        {
            setOu((TOu) newChild);
            return;
        }

        if(this._expressaoLogica_ == oldChild)
        {
            setExpressaoLogica((PExpressaoLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}