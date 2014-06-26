/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorQExpressaoGeral extends PExpressaoGeral
{
    private PExpressao _expressao_;
    private TMaiorQ _maiorQ_;
    private PExpressaoGeral _expressaoGeral_;

    public AMaiorQExpressaoGeral()
    {
        // Constructor
    }

    public AMaiorQExpressaoGeral(
        @SuppressWarnings("hiding") PExpressao _expressao_,
        @SuppressWarnings("hiding") TMaiorQ _maiorQ_,
        @SuppressWarnings("hiding") PExpressaoGeral _expressaoGeral_)
    {
        // Constructor
        setExpressao(_expressao_);

        setMaiorQ(_maiorQ_);

        setExpressaoGeral(_expressaoGeral_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorQExpressaoGeral(
            cloneNode(this._expressao_),
            cloneNode(this._maiorQ_),
            cloneNode(this._expressaoGeral_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorQExpressaoGeral(this);
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

    public TMaiorQ getMaiorQ()
    {
        return this._maiorQ_;
    }

    public void setMaiorQ(TMaiorQ node)
    {
        if(this._maiorQ_ != null)
        {
            this._maiorQ_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maiorQ_ = node;
    }

    public PExpressaoGeral getExpressaoGeral()
    {
        return this._expressaoGeral_;
    }

    public void setExpressaoGeral(PExpressaoGeral node)
    {
        if(this._expressaoGeral_ != null)
        {
            this._expressaoGeral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressaoGeral_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressao_)
            + toString(this._maiorQ_)
            + toString(this._expressaoGeral_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        if(this._maiorQ_ == child)
        {
            this._maiorQ_ = null;
            return;
        }

        if(this._expressaoGeral_ == child)
        {
            this._expressaoGeral_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        if(this._maiorQ_ == oldChild)
        {
            setMaiorQ((TMaiorQ) newChild);
            return;
        }

        if(this._expressaoGeral_ == oldChild)
        {
            setExpressaoGeral((PExpressaoGeral) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
