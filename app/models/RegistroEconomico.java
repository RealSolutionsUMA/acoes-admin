package models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "registro_economico", schema = "acoes", catalog = "")
public class RegistroEconomico {
    private int id;
    private Date fecha;
    private Object tipo;
    private String concepto;
    private double importe;
    private int codigoBeneficiario;
    private String observaciones;
    private int codigoServicio;
    private int responsable;
    private int proyecto;
    private int numeroSocio;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fecha", nullable = false)
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "tipo", nullable = false)
    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    @Basic
    @Column(name = "concepto", nullable = false, length = 45)
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @Basic
    @Column(name = "importe", nullable = false, precision = 0)
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Basic
    @Column(name = "codigo_beneficiario", nullable = false)
    public int getCodigoBeneficiario() {
        return codigoBeneficiario;
    }

    public void setCodigoBeneficiario(int codigoBeneficiario) {
        this.codigoBeneficiario = codigoBeneficiario;
    }

    @Basic
    @Column(name = "observaciones", nullable = true, length = 100)
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Basic
    @Column(name = "codigo_servicio", nullable = false)
    public int getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    @Basic
    @Column(name = "responsable", nullable = false)
    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    @Basic
    @Column(name = "proyecto", nullable = false)
    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    @Basic
    @Column(name = "numero_socio", nullable = false)
    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroEconomico that = (RegistroEconomico) o;
        return id == that.id &&
              Double.compare(that.importe, importe) == 0 &&
              codigoBeneficiario == that.codigoBeneficiario &&
              codigoServicio == that.codigoServicio &&
              responsable == that.responsable &&
              proyecto == that.proyecto &&
              numeroSocio == that.numeroSocio &&
              Objects.equals(fecha, that.fecha) &&
              Objects.equals(tipo, that.tipo) &&
              Objects.equals(concepto, that.concepto) &&
              Objects.equals(observaciones, that.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, tipo, concepto, importe, codigoBeneficiario, observaciones, codigoServicio, responsable, proyecto, numeroSocio);
    }
}
