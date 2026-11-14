package Entities;

import java.time.LocalDateTime;

public class Envio {
    private int idEnvio;
    private Cotizacion cotizacion;
    private Paquete paquete;
    private String destino;
    private Cliente remitente;
    private Cliente destinatario;
    private Salida salida;
    private String numeroGuia;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaRetiro;
    
    public Envio(int idEnvio, Cotizacion cotizacion, Paquete paquete, String destino, Cliente remitente,
            Cliente destinatario, Salida salida, String numeroGuia, LocalDateTime fechaRegistro) {
        this.idEnvio = idEnvio;
        this.cotizacion = cotizacion;
        this.paquete = paquete;
        this.destino = destino;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.salida = salida;
        this.numeroGuia = numeroGuia;
        this.fechaRegistro = fechaRegistro;
    }
    public int getIdEnvio() {
        return idEnvio;
    }
    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }
    public Cotizacion getCotizacion() {
        return cotizacion;
    }
    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }
    public Paquete getPaquete() {
        return paquete;
    }
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public Cliente getRemitente() {
        return remitente;
    }
    public void setRemitente(Cliente remitente) {
        this.remitente = remitente;
    }
    public Cliente getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }
    public Salida getSalida() {
        return salida;
    }
    public void setSalida(Salida salida) {
        this.salida = salida;
    }
    public String getNumeroGuia() {
        return numeroGuia;
    }
    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }
    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public LocalDateTime getFechaRetiro() {
        return fechaRetiro;
    }
    public void setFechaRetiro(LocalDateTime fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }
    
    
}
