/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Miller
 */
@Entity
@Table(name = "estudiantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiantes.findAll", query = "SELECT e FROM Estudiantes e")
    , @NamedQuery(name = "Estudiantes.findByCodE", query = "SELECT e FROM Estudiantes e WHERE e.codE = :codE")
    , @NamedQuery(name = "Estudiantes.findByNomE", query = "SELECT e FROM Estudiantes e WHERE e.nomE = :nomE")
    , @NamedQuery(name = "Estudiantes.findByDirE", query = "SELECT e FROM Estudiantes e WHERE e.dirE = :dirE")
    , @NamedQuery(name = "Estudiantes.findByTelE", query = "SELECT e FROM Estudiantes e WHERE e.telE = :telE")
    , @NamedQuery(name = "Estudiantes.findByCodCarr", query = "SELECT e FROM Estudiantes e WHERE e.codCarr = :codCarr")
    , @NamedQuery(name = "Estudiantes.findByFNac", query = "SELECT e FROM Estudiantes e WHERE e.fNac = :fNac")})
public class Estudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_e")
    private Long codE;
    @Basic(optional = false)
    @Column(name = "nom_e")
    private String nomE;
    @Basic(optional = false)
    @Column(name = "dir_e")
    private String dirE;
    @Column(name = "tel_e")
    private BigInteger telE;
    @Column(name = "cod_carr")
    private BigInteger codCarr;
    @Basic(optional = false)
    @Column(name = "f_nac")
    @Temporal(TemporalType.DATE)
    private Date fNac;

    public Estudiantes() {
    }

    public Estudiantes(Long codE) {
        this.codE = codE;
    }

    public Estudiantes(Long codE, String nomE, String dirE, Date fNac) {
        this.codE = codE;
        this.nomE = nomE;
        this.dirE = dirE;
        this.fNac = fNac;
    }

    public Long getCodE() {
        return codE;
    }

    public void setCodE(Long codE) {
        this.codE = codE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public String getDirE() {
        return dirE;
    }

    public void setDirE(String dirE) {
        this.dirE = dirE;
    }

    public BigInteger getTelE() {
        return telE;
    }

    public void setTelE(BigInteger telE) {
        this.telE = telE;
    }

    public BigInteger getCodCarr() {
        return codCarr;
    }

    public void setCodCarr(BigInteger codCarr) {
        this.codCarr = codCarr;
    }

    public Date getFNac() {
        return fNac;
    }

    public void setFNac(Date fNac) {
        this.fNac = fNac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codE != null ? codE.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiantes)) {
            return false;
        }
        Estudiantes other = (Estudiantes) object;
        if ((this.codE == null && other.codE != null) || (this.codE != null && !this.codE.equals(other.codE))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Estudiantes[ codE=" + codE + " ]";
    }
    
}
