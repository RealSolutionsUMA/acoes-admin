package models.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class UsuarioLocalPK implements Serializable {
    private int id;
    private int centro;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "centro", nullable = false)
    @Id
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
        UsuarioLocalPK that = (UsuarioLocalPK) o;
        return id == that.id &&
              centro == that.centro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, centro);
    }
}
