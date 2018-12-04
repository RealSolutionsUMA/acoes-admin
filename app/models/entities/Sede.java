package models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sede")
@NamedQuery(name = "Sede.findAll", query = "SELECT s FROM Sede s")
public class Sede {
    public enum Region {
        Espana
    }
    private int id;
    private Region region;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "region", columnDefinition = "enum('Espana')", nullable = false)
    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sede sede = (Sede) o;
        return id == sede.id &&
              Objects.equals(region, sede.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, region);
    }
}
