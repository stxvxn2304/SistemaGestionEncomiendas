package DAOs;

import java.util.ArrayList;
import java.util.List;

import Entities.GuiaRemision;

public class GuiaRemisionDAO {
    private final List<GuiaRemision> registros = new ArrayList<>();

    // CREATE
    public boolean guardar(GuiaRemision guiaRemision) {
        if (guiaRemision == null || buscarPorNumero(guiaRemision.getNumeroGuiaRemision()) != null) {
            return false; 
        }
        registros.add(guiaRemision);
        return true;
    }

    // READ (uno)
    public GuiaRemision buscarPorNumero(String numeroGuiaRemision) {
        for (GuiaRemision guiaRemision : registros) {
            if (guiaRemision.getNumeroGuiaRemision() == numeroGuiaRemision) {
                return guiaRemision;
            }
        }
        return null;
    }

    // READ (todos)
    public List<GuiaRemision> listarTodos() {
        return new ArrayList<>(registros);
    }

    // UPDATE
    public boolean actualizar(GuiaRemision guiaRemision) {
        if (guiaRemision == null) return false;

        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getNumeroGuiaRemision() == guiaRemision.getNumeroGuiaRemision()) {
                registros.set(i, guiaRemision);
                return true;
            }
        }
        return false; 
    }

    // DELETE
    public boolean eliminar(String numeroGuiaRemision) {
        GuiaRemision guiaRemision = buscarPorNumero(numeroGuiaRemision);
        if (guiaRemision == null) return false;
        return registros.remove(guiaRemision);
    }
}
