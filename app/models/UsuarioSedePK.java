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
public class UsuarioSedePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sede")
    private int sede;

    public UsuarioSedePK() {
    }

    public UsuarioSedePK(int id, int sede) {
        this.id = id;
        this.sede = sede;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSede() {
        return sede;
    }

    public void setSede(int sede) {
        this.sede = sede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) sede;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioSedePK)) {
            return false;
        }
        UsuarioSedePK other = (UsuarioSedePK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.sede != other.sede) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsuarioSedePK[ id=" + id + ", sede=" + sede + " ]";
    }
    
}
