package models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Alumno {
    public enum Sexo{
        Masculino,
        Femenino
    }
    private int codigo;
    private String nombre;
    private String apellidos;
    private String estado;
    private Sexo sexo;
    private String foto;
    private Date fechaNacimiento;
    private Date fechaEntradaAcoes;
    private Date fechaAlta;
    private Date fechaSalidaAcoes;
    private int gradoCurso;
    private String coloniaProcedencia;
    private String coloniaActual;
    private String observaciones;

    @Id
    @Column(name = "codigo", nullable = false)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", columnDefinition = "ENUM('Masculino', 'Femenino')", nullable = false)
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "foto", nullable = true, length = 100)
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Basic
    @Column(name = "fecha_nacimiento", nullable = false)
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "fecha_entrada_acoes", nullable = false)
    public Date getFechaEntradaAcoes() {
        return fechaEntradaAcoes;
    }

    public void setFechaEntradaAcoes(Date fechaEntradaAcoes) {
        this.fechaEntradaAcoes = fechaEntradaAcoes;
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
    @Column(name = "fecha_salida_acoes", nullable = true)
    public Date getFechaSalidaAcoes() {
        return fechaSalidaAcoes;
    }

    public void setFechaSalidaAcoes(Date fechaSalidaAcoes) {
        this.fechaSalidaAcoes = fechaSalidaAcoes;
    }

    @Basic
    @Column(name = "grado_curso", nullable = false)
    public int getGradoCurso() {
        return gradoCurso;
    }

    public void setGradoCurso(int gradoCurso) {
        this.gradoCurso = gradoCurso;
    }

    @Basic
    @Column(name = "colonia_procedencia", nullable = false, length = 45)
    public String getColoniaProcedencia() {
        return coloniaProcedencia;
    }

    public void setColoniaProcedencia(String coloniaProcedencia) {
        this.coloniaProcedencia = coloniaProcedencia;
    }

    @Basic
    @Column(name = "colonia_actual", nullable = false, length = 45)
    public String getColoniaActual() {
        return coloniaActual;
    }

    public void setColoniaActual(String coloniaActual) {
        this.coloniaActual = coloniaActual;
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
        Alumno alumno = (Alumno) o;
        return codigo == alumno.codigo &&
              gradoCurso == alumno.gradoCurso &&
              Objects.equals(nombre, alumno.nombre) &&
              Objects.equals(apellidos, alumno.apellidos) &&
              Objects.equals(estado, alumno.estado) &&
              Objects.equals(sexo, alumno.sexo) &&
              Objects.equals(foto, alumno.foto) &&
              Objects.equals(fechaNacimiento, alumno.fechaNacimiento) &&
              Objects.equals(fechaEntradaAcoes, alumno.fechaEntradaAcoes) &&
              Objects.equals(fechaAlta, alumno.fechaAlta) &&
              Objects.equals(fechaSalidaAcoes, alumno.fechaSalidaAcoes) &&
              Objects.equals(coloniaProcedencia, alumno.coloniaProcedencia) &&
              Objects.equals(coloniaActual, alumno.coloniaActual) &&
              Objects.equals(observaciones, alumno.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, apellidos, estado, sexo, foto, fechaNacimiento, fechaEntradaAcoes, fechaAlta, fechaSalidaAcoes, gradoCurso, coloniaProcedencia, coloniaActual, observaciones);
    }
}
