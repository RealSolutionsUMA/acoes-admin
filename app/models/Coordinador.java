/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author archie
 */
@Entity
@Table(name = "coordinador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coordinador.findAll", query = "SELECT c FROM Coordinador c")
    , @NamedQuery(name = "Coordinador.findById", query = "SELECT c FROM Coordinador c WHERE c.id = :id")})
public class Coordinador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private UsuarioLocal usuarioLocal;

    public Coordinador() {
    }

    public Coordinador(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UsuarioLocal getUsuarioLocal() {
        return usuarioLocal;
    }

    public void setUsuarioLocal(UsuarioLocal usuarioLocal) {
        this.usuarioLocal = usuarioLocal;
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
        if (!(object instanceof Coordinador)) {
            return false;
        }
        Coordinador other = (Coordinador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Coordinador[ id=" + id + " ]";
    }
    
}
