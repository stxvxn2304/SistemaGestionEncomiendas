package Entities;

import java.time.LocalDate;

public class Cotizacion {
    private int idCotizacion;
    private LocalDate fecha;
    private float peso;
    private float alto;
    private float largo;
    private float ancho;
    private String destino;
    private float valorEstimado;
    private Tarifa tarifa;

    
    public Cotizacion(int idCotizacion, LocalDate fecha, float peso, float alto, float largo, float ancho,
            String destino) {
        this.idCotizacion = idCotizacion;
        this.fecha = fecha;
        this.peso = peso;
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
        this.destino = destino;
        this.valorEstimado = 0;
        this.tarifa = null;
    }
    public int getIdCotizacion() {
        return idCotizacion;
    }
    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAlto() {
        return alto;
    }
    public void setAlto(float alto) {
        this.alto = alto;
    }
    public float getLargo() {
        return largo;
    }
    public void setLargo(float largo) {
        this.largo = largo;
    }
    public float getAncho() {
        return ancho;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public float getValorEstimado() {
        return valorEstimado;
    }
    public void setValorEstimado(float valorEstimado) {
        this.valorEstimado = valorEstimado;
    }
    public Tarifa getTarifa() {
        return tarifa;
    }
    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
}
