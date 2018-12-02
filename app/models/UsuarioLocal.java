/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author archie
 */
@Entity
@Table(name = "usuario_local")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioLocal.findAll", query = "SELECT u FROM UsuarioLocal u")
    , @NamedQuery(name = "UsuarioLocal.findById", query = "SELECT u FROM UsuarioLocal u WHERE u.usuarioLocalPK.id = :id")
    , @NamedQuery(name = "UsuarioLocal.findByCentro", query = "SELECT u FROM UsuarioLocal u WHERE u.usuarioLocalPK.centro = :centro")})
public class UsuarioLocal implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioLocalPK usuarioLocalPK;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuarioLocal")
    private Administrador administrador;
    @JoinColumn(name = "centro", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Centro centro1;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuarioLocal")
    private Coordinador coordinador;

    public UsuarioLocal() {
    }

    public UsuarioLocal(UsuarioLocalPK usuarioLocalPK) {
        this.usuarioLocalPK = usuarioLocalPK;
    }

    public UsuarioLocal(int id, int centro) {
        this.usuarioLocalPK = new UsuarioLocalPK(id, centro);
    }

    public UsuarioLocalPK getUsuarioLocalPK() {
        return usuarioLocalPK;
    }

    public void setUsuarioLocalPK(UsuarioLocalPK usuarioLocalPK) {
        this.usuarioLocalPK = usuarioLocalPK;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Centro getCentro1() {
        return centro1;
    }

    public void setCentro1(Centro centro1) {
        this.centro1 = centro1;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioLocalPK != null ? usuarioLocalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioLocal)) {
            return false;
        }
        UsuarioLocal other = (UsuarioLocal) object;
        if ((this.usuarioLocalPK == null && other.usuarioLocalPK != null) || (this.usuarioLocalPK != null && !this.usuarioLocalPK.equals(other.usuarioLocalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsuarioLocal[ usuarioLocalPK=" + usuarioLocalPK + " ]";
    }
    
}
