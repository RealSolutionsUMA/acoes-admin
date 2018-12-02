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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "centro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Centro.findAll", query = "SELECT c FROM Centro c")
    , @NamedQuery(name = "Centro.findById", query = "SELECT c FROM Centro c WHERE c.centroPK.id = :id")
    , @NamedQuery(name = "Centro.findByNombre", query = "SELECT c FROM Centro c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Centro.findByProyecto", query = "SELECT c FROM Centro c WHERE c.centroPK.proyecto = :proyecto")})
public class Centro implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CentroPK centroPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "centro1")
    private Collection<UsuarioLocal> usuarioLocalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "centro1")
    private Collection<EstaEn> estaEnCollection;
    @JoinColumn(name = "proyecto", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Proyecto proyecto1;

    public Centro() {
    }

    public Centro(CentroPK centroPK) {
        this.centroPK = centroPK;
    }

    public Centro(CentroPK centroPK, String nombre) {
        this.centroPK = centroPK;
        this.nombre = nombre;
    }

    public Centro(int id, int proyecto) {
        this.centroPK = new CentroPK(id, proyecto);
    }

    public CentroPK getCentroPK() {
        return centroPK;
    }

    public void setCentroPK(CentroPK centroPK) {
        this.centroPK = centroPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<UsuarioLocal> getUsuarioLocalCollection() {
        return usuarioLocalCollection;
    }

    public void setUsuarioLocalCollection(Collection<UsuarioLocal> usuarioLocalCollection) {
        this.usuarioLocalCollection = usuarioLocalCollection;
    }

    @XmlTransient
    public Collection<EstaEn> getEstaEnCollection() {
        return estaEnCollection;
    }

    public void setEstaEnCollection(Collection<EstaEn> estaEnCollection) {
        this.estaEnCollection = estaEnCollection;
    }

    public Proyecto getProyecto1() {
        return proyecto1;
    }

    public void setProyecto1(Proyecto proyecto1) {
        this.proyecto1 = proyecto1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (centroPK != null ? centroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centro)) {
            return false;
        }
        Centro other = (Centro) object;
        if ((this.centroPK == null && other.centroPK != null) || (this.centroPK != null && !this.centroPK.equals(other.centroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Centro[ centroPK=" + centroPK + " ]";
    }
    
}
