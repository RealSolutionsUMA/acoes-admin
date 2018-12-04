package models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuario_sede", schema = "acoes", catalog = "")
@IdClass(UsuarioSedePK.class)
public class UsuarioSede {
    private int id;
    private int sede;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "sede", nullable = false)
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
        UsuarioSede that = (UsuarioSede) o;
        return id == that.id &&
              sede == that.sede;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sede);
    }
}
