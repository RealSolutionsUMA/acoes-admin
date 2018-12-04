package models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Proyecto {
    public enum RegionAyuda {
        Honduras
    }

    private int id;
    private String nombre;
    private String descripcion;
    private double repartoCombustible;
    private double repartoMantenimiento;
    private double repartoCtaContenedor;
    private RegionAyuda regionAyuda;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "descripcion", nullable = false, length = 100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "reparto_combustible", nullable = false, precision = 0)
    public double getRepartoCombustible() {
        return repartoCombustible;
    }

    public void setRepartoCombustible(double repartoCombustible) {
        this.repartoCombustible = repartoCombustible;
    }

    @Basic
    @Column(name = "reparto_mantenimiento", nullable = false, precision = 0)
    public double getRepartoMantenimiento() {
        return repartoMantenimiento;
    }

    public void setRepartoMantenimiento(double repartoMantenimiento) {
        this.repartoMantenimiento = repartoMantenimiento;
    }

    @Basic
    @Column(name = "reparto_cta_contenedor", nullable = false, precision = 0)
    public double getRepartoCtaContenedor() {
        return repartoCtaContenedor;
    }

    public void setRepartoCtaContenedor(double repartoCtaContenedor) {
        this.repartoCtaContenedor = repartoCtaContenedor;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "region_ayuda", nullable = false, columnDefinition = "ENUM('Honduras')")
    public RegionAyuda getRegionAyuda() {
        return regionAyuda;
    }

    public void setRegionAyuda(RegionAyuda regionAyuda) {
        this.regionAyuda = regionAyuda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proyecto proyecto = (Proyecto) o;
        return id == proyecto.id &&
              Double.compare(proyecto.repartoCombustible, repartoCombustible) == 0 &&
              Double.compare(proyecto.repartoMantenimiento, repartoMantenimiento) == 0 &&
              Double.compare(proyecto.repartoCtaContenedor, repartoCtaContenedor) == 0 &&
              Objects.equals(nombre, proyecto.nombre) &&
              Objects.equals(descripcion, proyecto.descripcion) &&
              Objects.equals(regionAyuda, proyecto.regionAyuda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descripcion, repartoCombustible, repartoMantenimiento, repartoCtaContenedor, regionAyuda);
    }
}
