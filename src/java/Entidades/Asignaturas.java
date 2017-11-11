/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Miller
 */
@Entity
@Table(name = "asignaturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignaturas.findAll", query = "SELECT a FROM Asignaturas a")
    , @NamedQuery(name = "Asignaturas.findByCodA", query = "SELECT a FROM Asignaturas a WHERE a.codA = :codA")
    , @NamedQuery(name = "Asignaturas.findByNomA", query = "SELECT a FROM Asignaturas a WHERE a.nomA = :nomA")
    , @NamedQuery(name = "Asignaturas.findByIh", query = "SELECT a FROM Asignaturas a WHERE a.ih = :ih")
    , @NamedQuery(name = "Asignaturas.findByCred", query = "SELECT a FROM Asignaturas a WHERE a.cred = :cred")})
public class Asignaturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_a")
    private Long codA;
    @Basic(optional = false)
    @Column(name = "nom_a")
    private String nomA;
    @Column(name = "ih")
    private Short ih;
    @Basic(optional = false)
    @Column(name = "cred")
    private short cred;

    public Asignaturas() {
    }

    public Asignaturas(Long codA) {
        this.codA = codA;
    }

    public Asignaturas(Long codA, String nomA, short cred) {
        this.codA = codA;
        this.nomA = nomA;
        this.cred = cred;
    }

    public Long getCodA() {
        return codA;
    }

    public void setCodA(Long codA) {
        this.codA = codA;
    }

    public String getNomA() {
        return nomA;
    }

    public void setNomA(String nomA) {
        this.nomA = nomA;
    }

    public Short getIh() {
        return ih;
    }

    public void setIh(Short ih) {
        this.ih = ih;
    }

    public short getCred() {
        return cred;
    }

    public void setCred(short cred) {
        this.cred = cred;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codA != null ? codA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignaturas)) {
            return false;
        }
        Asignaturas other = (Asignaturas) object;
        if ((this.codA == null && other.codA != null) || (this.codA != null && !this.codA.equals(other.codA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Asignaturas[ codA=" + codA + " ]";
    }
    
}
