package models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuario")
@NamedQueries({
      @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")
      @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
})
public class Usuario {
    public enum Rol {
        Agente,
        GerenteSede,
        GerenteRegional,
        CoordinadorLocal,
        CoordinadorGeneral,
        AdministradorLocal,
        AdministradorGeneral
    }

    private int id;
    private String nombre;
    private String email;
    private String contrasena;
    private Rol rol;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "contrasena", nullable = false, length = 15)
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "rol",
          columnDefinition = "enum('Agente', 'GerenteSede', 'GerenteRegional', 'CoordinadorLocal', " +
                "'CoordinadorGeneral', 'AdministradorLocal', 'AdministradorGeneral'"
          , nullable = false)
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id &&
              Objects.equals(nombre, usuario.nombre) &&
              Objects.equals(email, usuario.email) &&
              Objects.equals(contrasena, usuario.contrasena) &&
              Objects.equals(rol, usuario.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, email, contrasena, rol);
    }
}
