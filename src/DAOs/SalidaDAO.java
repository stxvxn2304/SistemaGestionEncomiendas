package DAOs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Entities.Salida;

public class SalidaDAO {
    private final List<Salida> registros = new ArrayList<>();

    // CREATE
    public boolean guardar(Salida salida) {
        if (salida == null || buscarPorId(salida.getIdSalida()) != null) {
            return false; 
        }
        registros.add(salida);
        return true;
    }

    // READ (uno)
    public Salida buscarPorId(int idSalida) {
        for (Salida salida : registros) {
            if (salida.getIdSalida() == idSalida) {
                return salida;
            }
        }
        return null;
    }

    public List<Salida> listarPorFecha(LocalDate fecha) {
        List<Salida> lista = new ArrayList<>();
        for (Salida salida : registros) {
            if (salida.getFechaHora().toLocalDate().isEqual(fecha)) {
                lista.add(salida);
            }
        }
        return lista;
    }

    // READ (todos)
    public List<Salida> listarTodos() {
        return new ArrayList<>(registros);
    }

    // UPDATE
    public boolean actualizar(Salida salida) {
        if (salida == null) return false;

        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getIdSalida() == salida.getIdSalida()) {
                registros.set(i, salida);
                return true;
            }
        }
        return false; 
    }

    // DELETE
    public boolean eliminar(int idSalida) {
        Salida salida = buscarPorId(idSalida);
        if (salida == null) return false;
        return registros.remove(salida);
    }
}
