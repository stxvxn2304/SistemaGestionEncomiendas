package DAOs;

import java.util.ArrayList;
import java.util.List;

import Entities.Cotizacion;

public class CotizacionDAO {
    private final List<Cotizacion> registros = new ArrayList<>();

    // CREATE
    public boolean guardar(Cotizacion cotizacion) {
        if (cotizacion == null || buscarPorId(cotizacion.getIdCotizacion()) != null) {
            return false; 
        }
        registros.add(cotizacion);
        return true;
    }

    // READ (uno)
    public Cotizacion buscarPorId(int idCotizacion) {
        for (Cotizacion cotizacion : registros) {
            if (cotizacion.getIdCotizacion() == idCotizacion) {
                return cotizacion;
            }
        }
        return null;
    }

    // READ (todos)
    public List<Cotizacion> listarTodos() {
        return new ArrayList<>(registros);
    }

    // UPDATE
    public boolean actualizar(Cotizacion cotizacion) {
        if (cotizacion == null) return false;

        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getIdCotizacion() == cotizacion.getIdCotizacion()) {
                registros.set(i, cotizacion);
                return true;
            }
        }
        return false; 
    }

    // DELETE
    public boolean eliminar(int idCotizacion) {
        Cotizacion cotizacion = buscarPorId(idCotizacion);
        if (cotizacion == null) return false;
        return registros.remove(cotizacion);
    }
}
