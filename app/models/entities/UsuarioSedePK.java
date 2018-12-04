package models.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class UsuarioSedePK implements Serializable {
    private int id;
    private int sede;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "sede", nullable = false)
    @Id
    public int getSede() {
        return sede;
    }

    public void setSede(int sede) {
        this.sede = sede;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioSedePK that = (UsuarioSedePK) o;
        return id == that.id &&
              sede == that.sede;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sede);
    }
}
