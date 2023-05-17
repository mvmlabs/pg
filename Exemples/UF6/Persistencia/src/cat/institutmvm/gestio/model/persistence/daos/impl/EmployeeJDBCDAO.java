package cat.institutmvm.gestio.model.persistence.daos.impl;

import cat.institutmvm.gestio.model.business.entities.Employee;
import cat.institutmvm.gestio.model.persistence.daos.contracts.EmployeeDAO;
import cat.institutmvm.gestio.model.persistence.exceptions.DAOException;
import cat.institutmvm.gestio.model.persistence.utils.JDBCUtils;
import java.io.IOException;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeJDBCDAO implements EmployeeDAO{

    @Override
    public Employee getEmployeeById(String id) throws DAOException {
        Employee empl = null;
        
        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("SELECT id,firstname, lastname, height, weight, salary, birthDate FROM employee WHERE id = ?")) {
            sentSQL.setString(1, id);
            try (ResultSet reader = sentSQL.executeQuery()) {
                if (reader.next()) {
                    // ORM: [--,--,--,--,--,--] -----> []Color
                    empl = JDBCUtils.geEmployee(reader);
                }            
            }
        }
        catch (SQLException  | IOException ex) {
            //Logger
            throw new DAOException(ex);
        }
        
        return empl;
    }

    @Override
    public List<Employee> getEmployees() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
