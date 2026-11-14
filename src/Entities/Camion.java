package Entities;

public class Camion {
    private String placa;
    private String chofer;
    
    public Camion(String placa, String chofer) {
        this.placa = placa;
        this.chofer = chofer;
    }
    
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getChofer() {
        return chofer;
    }
    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

}
