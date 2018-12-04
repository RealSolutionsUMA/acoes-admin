package models.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ResponsableEconomicoPK implements Serializable {
    private int id;
    private int administrador;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "administrador", nullable = false)
    @Id
    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponsableEconomicoPK that = (ResponsableEconomicoPK) o;
        return id == that.id &&
              administrador == that.administrador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, administrador);
    }
}
