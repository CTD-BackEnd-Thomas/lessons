package com.dh.dentalclinic.services;

import com.dh.dentalclinic.dao.impl.PatientDaoH2;
import com.dh.dentalclinic.model.Patient;

import java.sql.SQLException;

public class PatientService {

    private PatientDaoH2 patientDaoH2;

    public PatientService(PatientDaoH2 patientDaoH2) {
        this.patientDaoH2 = patientDaoH2;
    }

    public Patient save(Patient patient) throws SQLException {

        return patientDaoH2.save(patient);
    }



}
