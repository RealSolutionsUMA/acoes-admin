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
public class UsuarioLocalPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "centro")
    private int centro;

    public UsuarioLocalPK() {
    }

    public UsuarioLocalPK(int id, int centro) {
        this.id = id;
        this.centro = centro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCentro() {
        return centro;
    }

    public void setCentro(int centro) {
        this.centro = centro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) centro;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioLocalPK)) {
            return false;
        }
        UsuarioLocalPK other = (UsuarioLocalPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.centro != other.centro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsuarioLocalPK[ id=" + id + ", centro=" + centro + " ]";
    }
    
}
