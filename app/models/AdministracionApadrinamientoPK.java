package models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AdministracionApadrinamientoPK implements Serializable {
    private int apadrinamiento;
    private int agente;

    @Column(name = "apadrinamiento", nullable = false)
    @Id
    public int getApadrinamiento() {
        return apadrinamiento;
    }

    public void setApadrinamiento(int apadrinamiento) {
        this.apadrinamiento = apadrinamiento;
    }

    @Column(name = "agente", nullable = false)
    @Id
    public int getAgente() {
        return agente;
    }

    public void setAgente(int agente) {
        this.agente = agente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministracionApadrinamientoPK that = (AdministracionApadrinamientoPK) o;
        return apadrinamiento == that.apadrinamiento &&
              agente == that.agente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(apadrinamiento, agente);
    }
}
