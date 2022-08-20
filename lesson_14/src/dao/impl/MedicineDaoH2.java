package dao.impl;

import lesson_14.dao.ConfigJDBC;
import lesson_14.dao.IDao;
import lesson_14.model.Medicine;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicineDaoH2 implements IDao<Medicine> {

    private ConfigJDBC configJDBC;

    final static Logger logger = Logger.getLogger(Medicine.class);

    @Override
    public Medicine save(Medicine medicine) throws SQLException {
        logger.info("Registering Medicine: "+medicine.getName());
        configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/medicine;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
        Connection connection = configJDBC.getConnection();

        String query = String.format("INSERT INTO medicine (nome, laboratorio, quantidade, preco)" +
                        " values('%s','%s','%s','%s')",
                medicine.getName(),medicine.getManufacturer(),medicine.getQtd(),medicine.getPrice());

        try{
            Statement statement = connection.createStatement();
            statement.execute(query,Statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                medicine.setId(resultSet.getInt(1));
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connection.close();
        }

        return medicine;
    }
}
