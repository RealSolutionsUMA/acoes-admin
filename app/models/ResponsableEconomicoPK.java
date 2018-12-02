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

/**
 *
 * @author archie
 */
@Embeddable
public class ResponsableEconomicoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "administrador")
    private int administrador;

    public ResponsableEconomicoPK() {
    }

    public ResponsableEconomicoPK(int id, int administrador) {
        this.id = id;
        this.administrador = administrador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) administrador;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResponsableEconomicoPK)) {
            return false;
        }
        ResponsableEconomicoPK other = (ResponsableEconomicoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.administrador != other.administrador) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ResponsableEconomicoPK[ id=" + id + ", administrador=" + administrador + " ]";
    }
    
}
