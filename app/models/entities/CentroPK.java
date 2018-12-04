package models.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CentroPK implements Serializable {
    private int id;
    private int proyecto;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "proyecto", nullable = false)
    @Id
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
        CentroPK centroPK = (CentroPK) o;
        return id == centroPK.id &&
              proyecto == centroPK.proyecto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, proyecto);
    }
}
