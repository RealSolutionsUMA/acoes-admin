package models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "responsable_economico", schema = "acoes", catalog = "")
@IdClass(ResponsableEconomicoPK.class)
public class ResponsableEconomico {
    private int id;
    private int administrador;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "administrador", nullable = false)
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
        ResponsableEconomico that = (ResponsableEconomico) o;
        return id == that.id &&
              administrador == that.administrador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, administrador);
    }
}
