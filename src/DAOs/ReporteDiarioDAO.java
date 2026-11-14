package DAOs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Entities.ReporteDiario;

public class ReporteDiarioDAO {
    private final List<ReporteDiario> registros = new ArrayList<>();

    // CREATE
    public boolean guardar(ReporteDiario reporteDiario) {
        if (reporteDiario == null || buscarPorId(reporteDiario.getIdReporte()) != null) {
            return false; 
        }
        registros.add(reporteDiario);
        return true;
    }

    // READ (uno)
    public ReporteDiario buscarPorId(int idReporte) {
        for (ReporteDiario reporteDiario : registros) {
            if (reporteDiario.getIdReporte() == idReporte) {
                return reporteDiario;
            }
        }
        return null;
    }

    public ReporteDiario buscarPorFecha(LocalDate fecha) {
        for (ReporteDiario reporteDiario : registros) {
            if (reporteDiario.getFecha().isEqual(fecha)) {
                return reporteDiario;
            }
        }
        return null;
    }

    // READ (todos)
    public List<ReporteDiario> listarTodos() {
        return new ArrayList<>(registros);
    }

    // UPDATE
    public boolean actualizar(ReporteDiario reporteDiario) {
        if (reporteDiario == null) return false;

        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getIdReporte() == reporteDiario.getIdReporte()) {
                registros.set(i, reporteDiario);
                return true;
            }
        }
        return false; 
    }

    // DELETE
    public boolean eliminar(int idReporteDiario) {
        ReporteDiario reporteDiario = buscarPorId(idReporteDiario);
        if (reporteDiario == null) return false;
        return registros.remove(reporteDiario);
    }
}
