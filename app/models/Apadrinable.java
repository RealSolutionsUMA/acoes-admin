/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author archie
 */
@Entity
@Table(name = "apadrinable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apadrinable.findAll", query = "SELECT a FROM Apadrinable a")
    , @NamedQuery(name = "Apadrinable.findById", query = "SELECT a FROM Apadrinable a WHERE a.id = :id")})
public class Apadrinable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apadrinable")
    private Collection<Apadrinamiento> apadrinamientoCollection;
    @JoinColumn(name = "id", referencedColumnName = "codigo", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Alumno alumno;

    public Apadrinable() {
    }

    public Apadrinable(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public Collection<Apadrinamiento> getApadrinamientoCollection() {
        return apadrinamientoCollection;
    }

    public void setApadrinamientoCollection(Collection<Apadrinamiento> apadrinamientoCollection) {
        this.apadrinamientoCollection = apadrinamientoCollection;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apadrinable)) {
            return false;
        }
        Apadrinable other = (Apadrinable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Apadrinable[ id=" + id + " ]";
    }
    
}
