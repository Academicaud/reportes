/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Miller
 */
@Embeddable
public class InscribePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cod_e")
    private long codE;
    @Basic(optional = false)
    @Column(name = "id_p")
    private long idP;
    @Basic(optional = false)
    @Column(name = "cod_a")
    private long codA;
    @Basic(optional = false)
    @Column(name = "grupo")
    private short grupo;

    public InscribePK() {
    }

    public InscribePK(long codE, long idP, long codA, short grupo) {
        this.codE = codE;
        this.idP = idP;
        this.codA = codA;
        this.grupo = grupo;
    }

    public long getCodE() {
        return codE;
    }

    public void setCodE(long codE) {
        this.codE = codE;
    }

    public long getIdP() {
        return idP;
    }

    public void setIdP(long idP) {
        this.idP = idP;
    }

    public long getCodA() {
        return codA;
    }

    public void setCodA(long codA) {
        this.codA = codA;
    }

    public short getGrupo() {
        return grupo;
    }

    public void setGrupo(short grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codE;
        hash += (int) idP;
        hash += (int) codA;
        hash += (int) grupo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InscribePK)) {
            return false;
        }
        InscribePK other = (InscribePK) object;
        if (this.codE != other.codE) {
            return false;
        }
        if (this.idP != other.idP) {
            return false;
        }
        if (this.codA != other.codA) {
            return false;
        }
        if (this.grupo != other.grupo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.InscribePK[ codE=" + codE + ", idP=" + idP + ", codA=" + codA + ", grupo=" + grupo + " ]";
    }
    
}
