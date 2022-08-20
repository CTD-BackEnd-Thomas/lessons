package medicamentos.service;

import medicamentos.dao.impl.MedicamentoDaoH2;
import medicamentos.model.Medicamento;

import java.sql.SQLException;

public class MedicamentoService {

    private MedicamentoDaoH2 medicamentoDao;

    public MedicamentoService(MedicamentoDaoH2 medicamentoDao) {

        this.medicamentoDao = medicamentoDao;
    }

    public Medicamento salvar(Medicamento medicamento) throws SQLException {
        return medicamentoDao.salvar(medicamento);

    }
}
