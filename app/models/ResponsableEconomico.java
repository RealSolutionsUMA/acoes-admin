/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Table(name = "responsable_economico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResponsableEconomico.findAll", query = "SELECT r FROM ResponsableEconomico r")
    , @NamedQuery(name = "ResponsableEconomico.findById", query = "SELECT r FROM ResponsableEconomico r WHERE r.responsableEconomicoPK.id = :id")
    , @NamedQuery(name = "ResponsableEconomico.findByAdministrador", query = "SELECT r FROM ResponsableEconomico r WHERE r.responsableEconomicoPK.administrador = :administrador")})
public class ResponsableEconomico implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResponsableEconomicoPK responsableEconomicoPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsable")
    private Collection<RegistroEconomico> registroEconomicoCollection;
    @JoinColumn(name = "administrador", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Administrador administrador1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "responsableEconomico")
    private Gerente gerente;

    public ResponsableEconomico() {
    }

    public ResponsableEconomico(ResponsableEconomicoPK responsableEconomicoPK) {
        this.responsableEconomicoPK = responsableEconomicoPK;
    }

    public ResponsableEconomico(int id, int administrador) {
        this.responsableEconomicoPK = new ResponsableEconomicoPK(id, administrador);
    }

    public ResponsableEconomicoPK getResponsableEconomicoPK() {
        return responsableEconomicoPK;
    }

    public void setResponsableEconomicoPK(ResponsableEconomicoPK responsableEconomicoPK) {
        this.responsableEconomicoPK = responsableEconomicoPK;
    }

    @XmlTransient
    public Collection<RegistroEconomico> getRegistroEconomicoCollection() {
        return registroEconomicoCollection;
    }

    public void setRegistroEconomicoCollection(Collection<RegistroEconomico> registroEconomicoCollection) {
        this.registroEconomicoCollection = registroEconomicoCollection;
    }

    public Administrador getAdministrador1() {
        return administrador1;
    }

    public void setAdministrador1(Administrador administrador1) {
        this.administrador1 = administrador1;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (responsableEconomicoPK != null ? responsableEconomicoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResponsableEconomico)) {
            return false;
        }
        ResponsableEconomico other = (ResponsableEconomico) object;
        if ((this.responsableEconomicoPK == null && other.responsableEconomicoPK != null) || (this.responsableEconomicoPK != null && !this.responsableEconomicoPK.equals(other.responsableEconomicoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ResponsableEconomico[ responsableEconomicoPK=" + responsableEconomicoPK + " ]";
    }
    
}
