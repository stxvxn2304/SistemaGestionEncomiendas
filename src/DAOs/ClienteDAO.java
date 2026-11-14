package DAOs;

import java.util.ArrayList;
import java.util.List;

import Entities.Cliente;

public class ClienteDAO {
    private final List<Cliente> registros = new ArrayList<>();

    // CREATE
    public boolean guardar(Cliente cliente) {
        if (cliente == null || buscarPorId(cliente.getIdCliente()) != null) {
            return false; 
        }
        registros.add(cliente);
        return true;
    }

    // READ (uno)
    public Cliente buscarPorId(int idCliente) {
        for (Cliente cliente : registros) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente buscarPorIdentificacion(String identificacion) {
        for (Cliente cliente : registros) {
            if (cliente.getIdentificacion() == identificacion) {
                return cliente;
            }
        }
        return null;
    }

    // READ (todos)
    public List<Cliente> listarTodos() {
        return new ArrayList<>(registros);
    }

    // UPDATE
    public boolean actualizar(Cliente cliente) {
        if (cliente == null) return false;

        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getIdCliente() == cliente.getIdCliente()) {
                registros.set(i, cliente);
                return true;
            }
        }
        return false; 
    }

    // DELETE
    public boolean eliminar(int idCliente) {
        Cliente cliente = buscarPorId(idCliente);
        if (cliente == null) return false;
        return registros.remove(cliente);
    }
}