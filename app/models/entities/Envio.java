package models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Envio {
    public enum Estado {
        Preparado,
        Enviado,
        Recibido
    }
    private int id;
    private int apadrinamiento;
    private Estado estado;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", columnDefinition = "enum('Preparado', 'Enviado', 'Recibido')", nullable = false)
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
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
