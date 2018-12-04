package models.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ApadrinamientoPK implements Serializable {
    private int id;
    private int apadrinado;
    private int padrino;

    @Column(name = "id", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "apadrinado", nullable = false)
    @Id
    public int getApadrinado() {
        return apadrinado;
    }

    public void setApadrinado(int apadrinado) {
        this.apadrinado = apadrinado;
    }

    @Column(name = "padrino", nullable = false)
    @Id
    public int getPadrino() {
        return padrino;
    }

    public void setPadrino(int padrino) {
        this.padrino = padrino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApadrinamientoPK that = (ApadrinamientoPK) o;
        return id == that.id &&
              apadrinado == that.apadrinado &&
              padrino == that.padrino;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apadrinado, padrino);
    }
}
