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


@Entity
@Table(name = "usuario_sede")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioSede.findAll", query = "SELECT u FROM UsuarioSede u")
    , @NamedQuery(name = "UsuarioSede.findById", query = "SELECT u FROM UsuarioSede u WHERE u.usuarioSedePK.id = :id")
    , @NamedQuery(name = "UsuarioSede.findBySede", query = "SELECT u FROM UsuarioSede u WHERE u.usuarioSedePK.sede = :sede")})
public class UsuarioSede implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioSedePK usuarioSedePK;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuarioSede")
    private Agentes agentes;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "sede", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sede sede1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usuarioSede")
    private Gerente gerente;

    public UsuarioSede() {
    }

    public UsuarioSede(UsuarioSedePK usuarioSedePK) {
        this.usuarioSedePK = usuarioSedePK;
    }

    public UsuarioSede(int id, int sede) {
        this.usuarioSedePK = new UsuarioSedePK(id, sede);
    }

    public UsuarioSedePK getUsuarioSedePK() {
        return usuarioSedePK;
    }

    public void setUsuarioSedePK(UsuarioSedePK usuarioSedePK) {
        this.usuarioSedePK = usuarioSedePK;
    }

    public Agentes getAgentes() {
        return agentes;
    }

    public void setAgentes(Agentes agentes) {
        this.agentes = agentes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sede getSede1() {
        return sede1;
    }

    public void setSede1(Sede sede1) {
        this.sede1 = sede1;
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
        hash += (usuarioSedePK != null ? usuarioSedePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioSede)) {
            return false;
        }
        UsuarioSede other = (UsuarioSede) object;
        if ((this.usuarioSedePK == null && other.usuarioSedePK != null) || (this.usuarioSedePK != null && !this.usuarioSedePK.equals(other.usuarioSedePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsuarioSede[ usuarioSedePK=" + usuarioSedePK + " ]";
    }
    
}
