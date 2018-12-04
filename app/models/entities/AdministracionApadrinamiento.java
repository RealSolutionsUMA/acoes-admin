package models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "administracion_apadrinamiento", schema = "acoes", catalog = "")
@IdClass(AdministracionApadrinamientoPK.class)
public class AdministracionApadrinamiento {
    private int apadrinamiento;
    private int agente;
    private Date fechaInicio;
    private Date fechaFin;

    @Id
    @Column(name = "apadrinamiento", nullable = false)
    public int getApadrinamiento() {
        return apadrinamiento;
    }

    public void setApadrinamiento(int apadrinamiento) {
        this.apadrinamiento = apadrinamiento;
    }

    @Id
    @Column(name = "agente", nullable = false)
    public int getAgente() {
        return agente;
    }

    public void setAgente(int agente) {
        this.agente = agente;
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
        AdministracionApadrinamiento that = (AdministracionApadrinamiento) o;
        return apadrinamiento == that.apadrinamiento &&
              agente == that.agente &&
              Objects.equals(fechaInicio, that.fechaInicio) &&
              Objects.equals(fechaFin, that.fechaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apadrinamiento, agente, fechaInicio, fechaFin);
    }
}
