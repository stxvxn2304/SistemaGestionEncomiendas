package Enumerations;

public enum EstadoEnvio {
    REGISTRADO("Registrado"),
    EN_TRANSITO("En tránsito"),
    RECIBIDO("Recibido"),
    CON_NOVEDAD("Con novedad"),
    ENTREGADO("Entregado");

    private final String descripcion;

    EstadoEnvio(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

