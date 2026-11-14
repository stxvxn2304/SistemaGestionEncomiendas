package Entities;

import java.time.LocalDateTime;

import Enumerations.EstadoGuiaRemision;

public class GuiaRemision {
    private String numeroGuiaRemision;
    private LocalDateTime fechaEmision;
    private EstadoGuiaRemision estado;
    private Salida salida;
    
    
    public GuiaRemision(String numeroGuiaRemision, LocalDateTime fechaEmision, Salida salida) {
        this.numeroGuiaRemision = numeroGuiaRemision;
        this.fechaEmision = fechaEmision;
        this.estado = EstadoGuiaRemision.EMITIDA;
        this.salida = salida;
    }
    public String getNumeroGuiaRemision() {
        return numeroGuiaRemision;
    }
    public void setNumeroGuiaRemision(String numeroGuiaRemision) {
        this.numeroGuiaRemision = numeroGuiaRemision;
    }
    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    public EstadoGuiaRemision getEstado() {
        return estado;
    }
    public void setEstado(EstadoGuiaRemision estado) {
        this.estado = estado;
    }
    public Salida getSalida() {
        return salida;
    }
    public void setSalida(Salida salida) {
        this.salida = salida;
    }

}
