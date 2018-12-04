package models.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Socio {
    private int numeroDeSocio;
    private String nombre;
    private String apellidos;
    private String estado;
    private String nif;
    private String direccion;
    private String poblacion;
    private String codigoPostal;
    private String provincia;
    private Integer telefonoFijo;
    private int telefonoMovil;
    private String email;
    private String relacion;
    private boolean certificado;
    private String sector;
    private Date fechaAlta;
    private Date fechaBaja;
    private String observaciones;

    @Id
    @Column(name = "numero_de_socio", nullable = false)
    public int getNumeroDeSocio() {
        return numeroDeSocio;
    }

    public void setNumeroDeSocio(int numeroDeSocio) {
        this.numeroDeSocio = numeroDeSocio;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 45)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellidos", nullable = false, length = 45)
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Basic
    @Column(name = "estado", nullable = true, length = 15)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "nif", nullable = false, length = 9)
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Basic
    @Column(name = "direccion", nullable = false, length = 45)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "poblacion", nullable = false, length = 30)
    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Basic
    @Column(name = "codigo_postal", nullable = false, length = 10)
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Basic
    @Column(name = "provincia", nullable = false, length = 25)
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Basic
    @Column(name = "telefono_fijo", nullable = true)
    public Integer getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(Integer telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    @Basic
    @Column(name = "telefono_movil", nullable = false)
    public int getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(int telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "relacion", nullable = true, length = 45)
    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    @Basic
    @Column(name = "certificado", nullable = false)
    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    @Basic
    @Column(name = "sector", nullable = false, length = 50)
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Basic
    @Column(name = "fecha_alta", nullable = false)
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Basic
    @Column(name = "fecha_baja", nullable = true)
    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Basic
    @Column(name = "observaciones", nullable = true, length = 100)
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return numeroDeSocio == socio.numeroDeSocio &&
              telefonoMovil == socio.telefonoMovil &&
              certificado == socio.certificado &&
              Objects.equals(nombre, socio.nombre) &&
              Objects.equals(apellidos, socio.apellidos) &&
              Objects.equals(estado, socio.estado) &&
              Objects.equals(nif, socio.nif) &&
              Objects.equals(direccion, socio.direccion) &&
              Objects.equals(poblacion, socio.poblacion) &&
              Objects.equals(codigoPostal, socio.codigoPostal) &&
              Objects.equals(provincia, socio.provincia) &&
              Objects.equals(telefonoFijo, socio.telefonoFijo) &&
              Objects.equals(email, socio.email) &&
              Objects.equals(relacion, socio.relacion) &&
              Objects.equals(sector, socio.sector) &&
              Objects.equals(fechaAlta, socio.fechaAlta) &&
              Objects.equals(fechaBaja, socio.fechaBaja) &&
              Objects.equals(observaciones, socio.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDeSocio, nombre, apellidos, estado, nif, direccion, poblacion, codigoPostal, provincia, telefonoFijo, telefonoMovil, email, relacion, certificado, sector, fechaAlta, fechaBaja, observaciones);
    }
}
