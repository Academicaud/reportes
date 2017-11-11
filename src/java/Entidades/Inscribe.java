/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Miller
 */
@Entity
@Table(name = "inscribe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscribe.findAll", query = "SELECT i FROM Inscribe i")
    , @NamedQuery(name = "Inscribe.findByCodE", query = "SELECT i FROM Inscribe i WHERE i.inscribePK.codE = :codE")
    , @NamedQuery(name = "Inscribe.findByIdP", query = "SELECT i FROM Inscribe i WHERE i.inscribePK.idP = :idP")
    , @NamedQuery(name = "Inscribe.findByCodA", query = "SELECT i FROM Inscribe i WHERE i.inscribePK.codA = :codA")
    , @NamedQuery(name = "Inscribe.findByGrupo", query = "SELECT i FROM Inscribe i WHERE i.inscribePK.grupo = :grupo")
    , @NamedQuery(name = "Inscribe.findByN1", query = "SELECT i FROM Inscribe i WHERE i.n1 = :n1")
    , @NamedQuery(name = "Inscribe.findByN2", query = "SELECT i FROM Inscribe i WHERE i.n2 = :n2")
    , @NamedQuery(name = "Inscribe.findByN3", query = "SELECT i FROM Inscribe i WHERE i.n3 = :n3")})
public class Inscribe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InscribePK inscribePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "n1")
    private Double n1;
    @Column(name = "n2")
    private Double n2;
    @Column(name = "n3")
    private Double n3;

    public Inscribe() {
    }

    public Inscribe(InscribePK inscribePK) {
        this.inscribePK = inscribePK;
    }

    public Inscribe(long codE, long idP, long codA, short grupo) {
        this.inscribePK = new InscribePK(codE, idP, codA, grupo);
    }

    public InscribePK getInscribePK() {
        return inscribePK;
    }

    public void setInscribePK(InscribePK inscribePK) {
        this.inscribePK = inscribePK;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inscribePK != null ? inscribePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscribe)) {
            return false;
        }
        Inscribe other = (Inscribe) object;
        if ((this.inscribePK == null && other.inscribePK != null) || (this.inscribePK != null && !this.inscribePK.equals(other.inscribePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Inscribe[ inscribePK=" + inscribePK + " ]";
    }
    
}
