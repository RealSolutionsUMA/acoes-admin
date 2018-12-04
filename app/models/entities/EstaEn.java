package models.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "esta_en", schema = "acoes", catalog = "")
@IdClass(EstaEnPK.class)
public class EstaEn {
    private int alumno;
    private int centro;
    private Date fechaInicio;
    private Date fechaFin;

    @Id
    @Column(name = "alumno", nullable = false)
    public int getAlumno() {
        return alumno;
    }

    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }

    @Id
    @Column(name = "centro", nullable = false)
    public int getCentro() {
        return centro;
    }

    public void setCentro(int centro) {
        this.centro = centro;
    }

    @Basic
    @Column(name = "fechaInicio", nullable = false)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "fechaFin", nullable = true)
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
        EstaEn estaEn = (EstaEn) o;
        return alumno == estaEn.alumno &&
              centro == estaEn.centro &&
              Objects.equals(fechaInicio, estaEn.fechaInicio) &&
              Objects.equals(fechaFin, estaEn.fechaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alumno, centro, fechaInicio, fechaFin);
    }
}
