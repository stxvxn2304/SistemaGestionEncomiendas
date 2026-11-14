package Enumerations;

public enum EstadoEnvio {
    REGISTRADO("Registrado"),
    EN_TRANSITO("En tránsito"),
    RECIBIDO("Recibido"),
    CON_NOVEDAD("Con novedad"),
    ENTREGADO("Entregado");

    private final String nombre;

    EstadoEnvio(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return nombre;
    }
}

