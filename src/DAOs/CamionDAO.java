package DAOs;

import java.util.ArrayList;
import java.util.List;

import Entities.Camion;

public class CamionDAO {
    private final List<Camion> registros = new ArrayList<>();

    // CREATE
    public boolean guardar(Camion camion) {
        if (camion == null || buscarPorPlaca(camion.getPlaca()) != null) {
            return false; 
        }
        registros.add(camion);
        return true;
    }

    // READ (uno)
    public Camion buscarPorPlaca(String placa) {
        for (Camion camion : registros) {
            if (camion.getPlaca().equals(placa)) {
                return camion;
            }
        }
        return null;
    }

    // READ (todos)
    public List<Camion> listarTodos() {
        return new ArrayList<>(registros);
    }

    // UPDATE
    public boolean actualizar(Camion camion) {
        if (camion == null) return false;

        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getPlaca().equals(camion.getPlaca())) {
                registros.set(i, camion);
                return true;
            }
        }
        return false; 
    }

    // DELETE
    public boolean eliminar(String placa) {
        Camion camion = buscarPorPlaca(placa);
        if (camion == null) return false;
        return registros.remove(camion);
    }
}
