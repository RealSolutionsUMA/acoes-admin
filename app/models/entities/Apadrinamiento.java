package models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(ApadrinamientoPK.class)
public class Apadrinamiento {
    private int id;
    private int apadrinado;
    private int padrino;
    private Date fechaInicio;
    private Date fechaFin;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "apadrinado", nullable = false)
    public int getApadrinado() {
        return apadrinado;
    }

    public void setApadrinado(int apadrinado) {
        this.apadrinado = apadrinado;
    }

    @Id
    @Column(name = "padrino", nullable = false)
    public int getPadrino() {
        return padrino;
    }

    public void setPadrino(int padrino) {
        this.padrino = padrino;
    }

    @Basic
    @Column(name = "fecha_inicio", nullable = false)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "fecha_fin", nullable = true)
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apadrinamiento that = (Apadrinamiento) o;
        return id == that.id &&
              apadrinado == that.apadrinado &&
              padrino == that.padrino &&
              Objects.equals(fechaInicio, that.fechaInicio) &&
              Objects.equals(fechaFin, that.fechaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apadrinado, padrino, fechaInicio, fechaFin);
    }
}
