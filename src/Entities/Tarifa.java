package Entities;

public class Tarifa {
    private int idTarifa;
    private String destino;
    private float pesoMin;
    private float pesoMax;
    private float valor;
    
    public Tarifa(int idTarifa, String destino, float pesoMin, float pesoMax, float valor) {
        this.idTarifa = idTarifa;
        this.destino = destino;
        this.pesoMin = pesoMin;
        this.pesoMax = pesoMax;
        this.valor = valor;
    }

    public int getIdTarifa() {
        return idTarifa;
    }
    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public float getPesoMin() {
        return pesoMin;
    }
    public void setPesoMin(float pesoMin) {
        this.pesoMin = pesoMin;
    }
    public float getPesoMax() {
        return pesoMax;
    }
    public void setPesoMax(float pesoMax) {
        this.pesoMax = pesoMax;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
