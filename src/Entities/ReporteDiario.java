package Entities;

import java.time.LocalDate;

public class ReporteDiario {
    private int idReporte;
    private LocalDate fecha;
    private int totalEnvios;
    private int totalGuias;
    private int totalViajes;
    private int totalInventario;
    private float totalCobrado;
    
    public ReporteDiario(int idReporte, LocalDate fecha, int totalEnvios, int totalGuias, int totalViajes,
            int totalInventario, float totalCobrado) {
        this.idReporte = idReporte;
        this.fecha = fecha;
        this.totalEnvios = totalEnvios;
        this.totalGuias = totalGuias;
        this.totalViajes = totalViajes;
        this.totalInventario = totalInventario;
        this.totalCobrado = totalCobrado;
    }
    
    public int getIdReporte() {
        return idReporte;
    }
    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int getTotalEnvios() {
        return totalEnvios;
    }
    public void setTotalEnvios(int totalEnvios) {
        this.totalEnvios = totalEnvios;
    }
    public int getTotalGuias() {
        return totalGuias;
    }
    public void setTotalGuias(int totalGuias) {
        this.totalGuias = totalGuias;
    }
    public int getTotalViajes() {
        return totalViajes;
    }
    public void setTotalViajes(int totalViajes) {
        this.totalViajes = totalViajes;
    }
    public int getTotalInventario() {
        return totalInventario;
    }
    public void setTotalInventario(int totalInventario) {
        this.totalInventario = totalInventario;
    }
    public float getTotalCobrado() {
        return totalCobrado;
    }
    public void setTotalCobrado(float totalCobrado) {
        this.totalCobrado = totalCobrado;
    }
}
