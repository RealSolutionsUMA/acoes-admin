package models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuario_local", schema = "acoes", catalog = "")
@IdClass(UsuarioLocalPK.class)
public class UsuarioLocal {
    private int id;
    private int centro;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "centro", nullable = false)
    public int getCentro() {
        return centro;
    }

    public void setCentro(int centro) {
        this.centro = centro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioLocal that = (UsuarioLocal) o;
        return id == that.id &&
              centro == that.centro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, centro);
    }
}
