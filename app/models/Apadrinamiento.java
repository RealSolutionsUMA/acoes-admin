/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author archie
 */
@Entity
@Table(name = "apadrinamiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apadrinamiento.findAll", query = "SELECT a FROM Apadrinamiento a")
    , @NamedQuery(name = "Apadrinamiento.findById", query = "SELECT a FROM Apadrinamiento a WHERE a.apadrinamientoPK.id = :id")
    , @NamedQuery(name = "Apadrinamiento.findByApadrinado", query = "SELECT a FROM Apadrinamiento a WHERE a.apadrinamientoPK.apadrinado = :apadrinado")
    , @NamedQuery(name = "Apadrinamiento.findByPadrino", query = "SELECT a FROM Apadrinamiento a WHERE a.apadrinamientoPK.padrino = :padrino")
    , @NamedQuery(name = "Apadrinamiento.findByFechaInicio", query = "SELECT a FROM Apadrinamiento a WHERE a.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Apadrinamiento.findByFechaFin", query = "SELECT a FROM Apadrinamiento a WHERE a.fechaFin = :fechaFin")})
public class Apadrinamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApadrinamientoPK apadrinamientoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @JoinColumn(name = "apadrinado", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apadrinable apadrinable;
    @JoinColumn(name = "padrino", referencedColumnName = "numero_de_socio", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Socio socio;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "apadrinamiento")
    private Envio envio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apadrinamiento1")
    private Collection<AdministracionApadrinamiento> administracionApadrinamientoCollection;

    public Apadrinamiento() {
    }

    public Apadrinamiento(ApadrinamientoPK apadrinamientoPK) {
        this.apadrinamientoPK = apadrinamientoPK;
    }

    public Apadrinamiento(ApadrinamientoPK apadrinamientoPK, Date fechaInicio) {
        this.apadrinamientoPK = apadrinamientoPK;
        this.fechaInicio = fechaInicio;
    }

    public Apadrinamiento(int id, int apadrinado, int padrino) {
        this.apadrinamientoPK = new ApadrinamientoPK(id, apadrinado, padrino);
    }

    public ApadrinamientoPK getApadrinamientoPK() {
        return apadrinamientoPK;
    }

    public void setApadrinamientoPK(ApadrinamientoPK apadrinamientoPK) {
        this.apadrinamientoPK = apadrinamientoPK;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Apadrinable getApadrinable() {
        return apadrinable;
    }

    public void setApadrinable(Apadrinable apadrinable) {
        this.apadrinable = apadrinable;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    @XmlTransient
    public Collection<AdministracionApadrinamiento> getAdministracionApadrinamientoCollection() {
        return administracionApadrinamientoCollection;
    }

    public void setAdministracionApadrinamientoCollection(Collection<AdministracionApadrinamiento> administracionApadrinamientoCollection) {
        this.administracionApadrinamientoCollection = administracionApadrinamientoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apadrinamientoPK != null ? apadrinamientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apadrinamiento)) {
            return false;
        }
        Apadrinamiento other = (Apadrinamiento) object;
        if ((this.apadrinamientoPK == null && other.apadrinamientoPK != null) || (this.apadrinamientoPK != null && !this.apadrinamientoPK.equals(other.apadrinamientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Apadrinamiento[ apadrinamientoPK=" + apadrinamientoPK + " ]";
    }
    
}
