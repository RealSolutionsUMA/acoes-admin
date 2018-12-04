package models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EstaEnPK implements Serializable {
    private int alumno;
    private int centro;

    @Column(name = "alumno", nullable = false)
    @Id
    public int getAlumno() {
        return alumno;
    }

    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }

    @Column(name = "centro", nullable = false)
    @Id
    public int getCentro() {
        return centro;
    }

    public void setCentro(int centro) {
        this.centro = centro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstaEnPK estaEnPK = (EstaEnPK) o;
        return alumno == estaEnPK.alumno &&
              centro == estaEnPK.centro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alumno, centro);
    }
}
