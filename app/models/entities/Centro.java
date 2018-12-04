package models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(CentroPK.class)
public class Centro {
    private int id;
    private String nombre;
    private int proyecto;

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

    @Id
    @Column(name = "proyecto", nullable = false)
    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Centro centro = (Centro) o;
        return id == centro.id &&
              proyecto == centro.proyecto &&
              Objects.equals(nombre, centro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, proyecto);
    }
}
