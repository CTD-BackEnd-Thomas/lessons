package com.dh.dentalclinic.services;

import com.dh.dentalclinic.dao.impl.PatientDaoH2;
import com.dh.dentalclinic.model.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class PatientServiceTest {

    PatientService patientService;

    @BeforeEach
    void doBefore(){
        patientService = new PatientService(new PatientDaoH2());


    }

    @Test
    void savePatient() throws SQLException {
        Patient patient = new Patient("João","Santos","Rua 7 de setembro nº 357","4457","12/01/2009","joaosantos","1234");
        patientService.save(patient);
        Assertions.assertTrue(patient.getId() > 0);
    }

    @Test
    void updatePatient() throws SQLException{
        Patient patient = new Patient("Marcio","Santos","Rua Mônaco nº 22","1424577","11/11/2014","mcsantos","1111");
        patientService.save(patient);

        patient.setPassword("9999");
        patientService.update(patient);
        Assertions.assertEquals("9999", patient.getPassword());
    }

}