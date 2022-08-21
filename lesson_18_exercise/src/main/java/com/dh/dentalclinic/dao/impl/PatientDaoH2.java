package com.dh.dentalclinic.dao.impl;

import com.dh.dentalclinic.dao.ConfigJDBC;
import com.dh.dentalclinic.dao.IDao;
import com.dh.dentalclinic.model.Patient;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientDaoH2 implements IDao<Patient> {

    private ConfigJDBC configJDBC;

    final static Logger logger = Logger.getLogger(PatientDaoH2.class);

    @Override
    public Patient save(Patient patient) throws SQLException {
        logger.info("Registering patient: " + patient.getName());
        configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/dentalclinic;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
        Connection connection = configJDBC.getConnection();

        String query = String.format("INSERT INTO Patient (name, lastName, adress, idCard, registerDate, userName, password)" + " values('%s','%s','%s','%s','%s','%s','%s')",
                patient.getName(),patient.getLastName(),patient.getAdress(),patient.getIdCard(),patient.getRegisterDate(),patient.getUserName(),patient.getPassword());

        try{
            Statement statement = connection.createStatement();
            statement.execute(query,Statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                patient.setId(resultSet.getInt(1));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }

        return patient;

        }

    @Override
    public Patient update(Patient patient) throws SQLException {

    }


}
