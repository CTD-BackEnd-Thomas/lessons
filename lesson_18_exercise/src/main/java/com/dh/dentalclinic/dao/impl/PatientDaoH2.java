package com.dh.dentalclinic.dao.impl;

import com.dh.dentalclinic.dao.ConfigJDBC;
import com.dh.dentalclinic.dao.IDao;
import com.dh.dentalclinic.model.Patient;
import org.apache.log4j.Logger;

import java.sql.*;

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
        configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/dentalclinic","sa","");
        Connection conection1  = configJDBC.getConnection();

        String UPDATE = "UPDATE Patient SET name = ?, lastName = ?, adress = ?, idCard = ?, registerDate = ?, userName = ?, password = ? where ID=? ";

        try {

            conection1.setAutoCommit(false);

            PreparedStatement psUpdate =  conection1.prepareStatement(UPDATE);
            psUpdate.setString(1,patient.getName());
            psUpdate.setString(2,patient.getLastName());
            psUpdate.setString(3,patient.getAdress());
            psUpdate.setString(4,patient.getIdCard());
            psUpdate.setString(5,patient.getRegisterDate());
            psUpdate.setString(6,patient.getUserName());
            psUpdate.setString(7,patient.getPassword());
            psUpdate.setInt(8,patient.getId());

            conection1.commit();
            psUpdate.execute();

            conection1.setAutoCommit(true);

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            conection1.close();
        }

        return patient;

    }
}
