/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AVetorVariavel extends PVariavel
{
    private TId _id_;
    private TEColchete _eColchete_;
    private TNumero _numero_;
    private TDColchete _dColchete_;

    public AVetorVariavel()
    {
        // Constructor
    }

    public AVetorVariavel(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TEColchete _eColchete_,
        @SuppressWarnings("hiding") TNumero _numero_,
        @SuppressWarnings("hiding") TDColchete _dColchete_)
    {
        // Constructor
        setId(_id_);

        setEColchete(_eColchete_);

        setNumero(_numero_);

        setDColchete(_dColchete_);

    }

    @Override
    public Object clone()
    {
        return new AVetorVariavel(
            cloneNode(this._id_),
            cloneNode(this._eColchete_),
            cloneNode(this._numero_),
            cloneNode(this._dColchete_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVetorVariavel(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TEColchete getEColchete()
    {
        return this._eColchete_;
    }

    public void setEColchete(TEColchete node)
    {
        if(this._eColchete_ != null)
        {
            this._eColchete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eColchete_ = node;
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

    public TDColchete getDColchete()
    {
        return this._dColchete_;
    }

    public void setDColchete(TDColchete node)
    {
        if(this._dColchete_ != null)
        {
            this._dColchete_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dColchete_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._eColchete_)
            + toString(this._numero_)
            + toString(this._dColchete_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._eColchete_ == child)
        {
            this._eColchete_ = null;
            return;
        }

        if(this._numero_ == child)
        {
            this._numero_ = null;
            return;
        }

        if(this._dColchete_ == child)
        {
            this._dColchete_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._eColchete_ == oldChild)
        {
            setEColchete((TEColchete) newChild);
            return;
        }

        if(this._numero_ == oldChild)
        {
            setNumero((TNumero) newChild);
            return;
        }

        if(this._dColchete_ == oldChild)
        {
            setDColchete((TDColchete) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}