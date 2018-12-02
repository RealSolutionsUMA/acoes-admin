/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author archie
 */
@Entity
@Table(name = "administracion_apadrinamiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdministracionApadrinamiento.findAll", query = "SELECT a FROM AdministracionApadrinamiento a")
    , @NamedQuery(name = "AdministracionApadrinamiento.findByApadrinamiento", query = "SELECT a FROM AdministracionApadrinamiento a WHERE a.administracionApadrinamientoPK.apadrinamiento = :apadrinamiento")
    , @NamedQuery(name = "AdministracionApadrinamiento.findByAgente", query = "SELECT a FROM AdministracionApadrinamiento a WHERE a.administracionApadrinamientoPK.agente = :agente")
    , @NamedQuery(name = "AdministracionApadrinamiento.findByFechaInicio", query = "SELECT a FROM AdministracionApadrinamiento a WHERE a.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "AdministracionApadrinamiento.findByFechaFin", query = "SELECT a FROM AdministracionApadrinamiento a WHERE a.fechaFin = :fechaFin")})
public class AdministracionApadrinamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AdministracionApadrinamientoPK administracionApadrinamientoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @JoinColumn(name = "agente", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agentes agentes;
    @JoinColumn(name = "apadrinamiento", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apadrinamiento apadrinamiento1;

    public AdministracionApadrinamiento() {
    }

    public AdministracionApadrinamiento(AdministracionApadrinamientoPK administracionApadrinamientoPK) {
        this.administracionApadrinamientoPK = administracionApadrinamientoPK;
    }

    public AdministracionApadrinamiento(AdministracionApadrinamientoPK administracionApadrinamientoPK, Date fechaInicio) {
        this.administracionApadrinamientoPK = administracionApadrinamientoPK;
        this.fechaInicio = fechaInicio;
    }

    public AdministracionApadrinamiento(int apadrinamiento, int agente) {
        this.administracionApadrinamientoPK = new AdministracionApadrinamientoPK(apadrinamiento, agente);
    }

    public AdministracionApadrinamientoPK getAdministracionApadrinamientoPK() {
        return administracionApadrinamientoPK;
    }

    public void setAdministracionApadrinamientoPK(AdministracionApadrinamientoPK administracionApadrinamientoPK) {
        this.administracionApadrinamientoPK = administracionApadrinamientoPK;
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

    public Agentes getAgentes() {
        return agentes;
    }

    public void setAgentes(Agentes agentes) {
        this.agentes = agentes;
    }

    public Apadrinamiento getApadrinamiento1() {
        return apadrinamiento1;
    }

    public void setApadrinamiento1(Apadrinamiento apadrinamiento1) {
        this.apadrinamiento1 = apadrinamiento1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (administracionApadrinamientoPK != null ? administracionApadrinamientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdministracionApadrinamiento)) {
            return false;
        }
        AdministracionApadrinamiento other = (AdministracionApadrinamiento) object;
        if ((this.administracionApadrinamientoPK == null && other.administracionApadrinamientoPK != null) || (this.administracionApadrinamientoPK != null && !this.administracionApadrinamientoPK.equals(other.administracionApadrinamientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AdministracionApadrinamiento[ administracionApadrinamientoPK=" + administracionApadrinamientoPK + " ]";
    }
    
}
