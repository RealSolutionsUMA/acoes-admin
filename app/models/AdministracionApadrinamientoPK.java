/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;


@Embeddable
public class AdministracionApadrinamientoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "apadrinamiento")
    private int apadrinamiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agente")
    private int agente;

    public AdministracionApadrinamientoPK() {
    }

    public AdministracionApadrinamientoPK(int apadrinamiento, int agente) {
        this.apadrinamiento = apadrinamiento;
        this.agente = agente;
    }

    public int getApadrinamiento() {
        return apadrinamiento;
    }

    public void setApadrinamiento(int apadrinamiento) {
        this.apadrinamiento = apadrinamiento;
    }

    public int getAgente() {
        return agente;
    }

    public void setAgente(int agente) {
        this.agente = agente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) apadrinamiento;
        hash += (int) agente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdministracionApadrinamientoPK)) {
            return false;
        }
        AdministracionApadrinamientoPK other = (AdministracionApadrinamientoPK) object;
        if (this.apadrinamiento != other.apadrinamiento) {
            return false;
        }
        if (this.agente != other.agente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AdministracionApadrinamientoPK[ apadrinamiento=" + apadrinamiento + ", agente=" + agente + " ]";
    }
    
}
