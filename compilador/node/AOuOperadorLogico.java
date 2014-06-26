/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AOuOperadorLogico extends POperadorLogico
{
    private TOu _ou_;

    public AOuOperadorLogico()
    {
        // Constructor
    }

    public AOuOperadorLogico(
        @SuppressWarnings("hiding") TOu _ou_)
    {
        // Constructor
        setOu(_ou_);

    }

    @Override
    public Object clone()
    {
        return new AOuOperadorLogico(
            cloneNode(this._ou_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOuOperadorLogico(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._ou_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ou_ == child)
        {
            this._ou_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ou_ == oldChild)
        {
            setOu((TOu) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
