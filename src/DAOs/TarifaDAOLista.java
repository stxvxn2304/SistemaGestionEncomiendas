package DAOs;

import java.util.ArrayList;
import java.util.List;

import Entities.Tarifa;

public class TarifaDAOLista {
    private final List<Tarifa> registros = new ArrayList<>();

    // CREATE
    public boolean guardar(Tarifa tarifa) {
        if (tarifa == null || buscarPorId(tarifa.getIdTarifa()) != null) {
            return false; 
        }
        registros.add(tarifa);
        return true;
    }

    // READ (uno)
    public Tarifa buscarPorId(int idTarifa) {
        for (Tarifa tarifa : registros) {
            if (tarifa.getIdTarifa() == idTarifa) {
                return tarifa;
            }
        }
        return null;
    }

    public Tarifa buscarTarifa(String destino, float peso) {
        for (Tarifa tarifa : registros) {
            if ((tarifa.getDestino() == destino) && (peso <= tarifa.getPesoMax())&&(peso >= tarifa.getPesoMin())) {
                return tarifa;
            }
        }
        return null;
    }

    // READ (todos)
    public List<Tarifa> listarTodos() {
        return new ArrayList<>(registros);
    }

    // UPDATE
    public boolean actualizar(Tarifa tarifa) {
        if (tarifa == null) return false;

        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getIdTarifa() == tarifa.getIdTarifa()) {
                registros.set(i, tarifa);
                return true;
            }
        }
        return false; 
    }

    // DELETE
    public boolean eliminar(int idTarifa) {
        Tarifa tarifa = buscarPorId(idTarifa);
        if (tarifa == null) return false;
        return registros.remove(tarifa);
    }
}