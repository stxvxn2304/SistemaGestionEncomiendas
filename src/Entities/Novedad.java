package Entities;

import java.time.LocalDateTime;

import Enumerations.TipoNovedad;

public class Novedad {
    private TipoNovedad tipo;
    private String descripcion;
    private LocalDateTime fechaRegistro;
    
    public Novedad(TipoNovedad tipo, String descripcion, LocalDateTime fechaRegistro) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
    }
    
    public TipoNovedad getTipo() {
        return tipo;
    }
    public void setTipo(TipoNovedad tipo) {
        this.tipo = tipo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
