package DAOs;

import java.util.ArrayList;
import java.util.List;

import Entities.Paquete;

public class PaqueteDAO {
    private final List<Paquete> registros = new ArrayList<>();

    // CREATE
    public boolean guardar(Paquete paquete) {
        if (paquete == null || buscarPorId(paquete.getIdPaquete()) != null) {
            return false; 
        }
        registros.add(paquete);
        return true;
    }

    // READ (uno)
    public Paquete buscarPorId(int idPaquete) {
        for (Paquete paquete : registros) {
            if (paquete.getIdPaquete() == idPaquete) {
                return paquete;
            }
        }
        return null;
    }

    // READ (todos)
    public List<Paquete> listarTodos() {
        return new ArrayList<>(registros);
    }

    // UPDATE
    public boolean actualizar(Paquete paquete) {
        if (paquete == null) return false;

        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getIdPaquete() == paquete.getIdPaquete()) {
                registros.set(i, paquete);
                return true;
            }
        }
        return false; 
    }

    // DELETE
    public boolean eliminar(int idPaquete) {
        Paquete paquete = buscarPorId(idPaquete);
        if (paquete == null) return false;
        return registros.remove(paquete);
    }
}
