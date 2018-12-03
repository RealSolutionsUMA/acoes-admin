package models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Envio {
    private int id;
    private int apadrinamiento;
    private Object estado;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "apadrinamiento", nullable = false)
    public int getApadrinamiento() {
        return apadrinamiento;
    }

    public void setApadrinamiento(int apadrinamiento) {
        this.apadrinamiento = apadrinamiento;
    }

    @Basic
    @Column(name = "estado", nullable = false)
    public Object getEstado() {
        return estado;
    }

    public void setEstado(Object estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Envio envio = (Envio) o;
        return id == envio.id &&
              apadrinamiento == envio.apadrinamiento &&
              Objects.equals(estado, envio.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apadrinamiento, estado);
    }
}
