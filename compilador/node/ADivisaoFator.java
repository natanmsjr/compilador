/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADivisaoFator extends PFator
{
    private PFator _fator_;
    private TDivisao _divisao_;
    private PTermo _termo_;

    public ADivisaoFator()
    {
        // Constructor
    }

    public ADivisaoFator(
        @SuppressWarnings("hiding") PFator _fator_,
        @SuppressWarnings("hiding") TDivisao _divisao_,
        @SuppressWarnings("hiding") PTermo _termo_)
    {
        // Constructor
        setFator(_fator_);

        setDivisao(_divisao_);

        setTermo(_termo_);

    }

    @Override
    public Object clone()
    {
        return new ADivisaoFator(
            cloneNode(this._fator_),
            cloneNode(this._divisao_),
            cloneNode(this._termo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivisaoFator(this);
    }

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    public TDivisao getDivisao()
    {
        return this._divisao_;
    }

    public void setDivisao(TDivisao node)
    {
        if(this._divisao_ != null)
        {
            this._divisao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._divisao_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._fator_)
            + toString(this._divisao_)
            + toString(this._termo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        if(this._divisao_ == child)
        {
            this._divisao_ = null;
            return;
        }

        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        if(this._divisao_ == oldChild)
        {
            setDivisao((TDivisao) newChild);
            return;
        }

        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
