/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AVarVirgula extends PVarVirgula
{
    private TVirgula _virgula_;
    private PVariavel _variavel_;

    public AVarVirgula()
    {
        // Constructor
    }

    public AVarVirgula(
        @SuppressWarnings("hiding") TVirgula _virgula_,
        @SuppressWarnings("hiding") PVariavel _variavel_)
    {
        // Constructor
        setVirgula(_virgula_);

        setVariavel(_variavel_);

    }

    @Override
    public Object clone()
    {
        return new AVarVirgula(
            cloneNode(this._virgula_),
            cloneNode(this._variavel_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarVirgula(this);
    }

    public TVirgula getVirgula()
    {
        return this._virgula_;
    }

    public void setVirgula(TVirgula node)
    {
        if(this._virgula_ != null)
        {
            this._virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virgula_ = node;
    }

    public PVariavel getVariavel()
    {
        return this._variavel_;
    }

    public void setVariavel(PVariavel node)
    {
        if(this._variavel_ != null)
        {
            this._variavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variavel_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._virgula_)
            + toString(this._variavel_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._virgula_ == child)
        {
            this._virgula_ = null;
            return;
        }

        if(this._variavel_ == child)
        {
            this._variavel_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        if(this._variavel_ == oldChild)
        {
            setVariavel((PVariavel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}