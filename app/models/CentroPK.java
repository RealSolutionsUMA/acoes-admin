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
public class CentroPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "proyecto")
    private int proyecto;

    public CentroPK() {
    }

    public CentroPK(int id, int proyecto) {
        this.id = id;
        this.proyecto = proyecto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) proyecto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentroPK)) {
            return false;
        }
        CentroPK other = (CentroPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.proyecto != other.proyecto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CentroPK[ id=" + id + ", proyecto=" + proyecto + " ]";
    }
    
}
