/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AParaComandos extends PComandos
{
    private PVariavel _variavel_;
    private TNumero _inicio_;
    private TNumero _fim_;

    public AParaComandos()
    {
        // Constructor
    }

    public AParaComandos(
        @SuppressWarnings("hiding") PVariavel _variavel_,
        @SuppressWarnings("hiding") TNumero _inicio_,
        @SuppressWarnings("hiding") TNumero _fim_)
    {
        // Constructor
        setVariavel(_variavel_);

        setInicio(_inicio_);

        setFim(_fim_);

    }

    @Override
    public Object clone()
    {
        return new AParaComandos(
            cloneNode(this._variavel_),
            cloneNode(this._inicio_),
            cloneNode(this._fim_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParaComandos(this);
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

    public TNumero getInicio()
    {
        return this._inicio_;
    }

    public void setInicio(TNumero node)
    {
        if(this._inicio_ != null)
        {
            this._inicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inicio_ = node;
    }

    public TNumero getFim()
    {
        return this._fim_;
    }

    public void setFim(TNumero node)
    {
        if(this._fim_ != null)
        {
            this._fim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._variavel_)
            + toString(this._inicio_)
            + toString(this._fim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._variavel_ == child)
        {
            this._variavel_ = null;
            return;
        }

        if(this._inicio_ == child)
        {
            this._inicio_ = null;
            return;
        }

        if(this._fim_ == child)
        {
            this._fim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._variavel_ == oldChild)
        {
            setVariavel((PVariavel) newChild);
            return;
        }

        if(this._inicio_ == oldChild)
        {
            setInicio((TNumero) newChild);
            return;
        }

        if(this._fim_ == oldChild)
        {
            setFim((TNumero) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
