package cat.institutmvm.gestio.model.persistence.utils;

import cat.institutmvm.gestio.model.business.entities.Color;
import cat.institutmvm.gestio.model.business.entities.Company;
import cat.institutmvm.gestio.model.business.entities.Employee;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public final class JDBCUtils {

    
    private JDBCUtils() {
    }

    public static Connection openConnection() throws SQLException, IOException {
        Properties props = new Properties();
        props.load(new FileReader("config/jdbc.properties"));
        return DriverManager.getConnection(props.getProperty("mysql.url"),
                                           props.getProperty("mysql.username"),
                                           props.getProperty("mysql.password"));
    }
    
    public static Color getColor(ResultSet reader) throws SQLException {
       Color c =  new Color(reader.getString("name"), reader.getInt("red"), reader.getInt("green"), reader.getInt("blue"));
       c.setId(reader.getInt("id"));
       return c;
    }
    
    public static Employee geEmployee(ResultSet reader) throws SQLException {
       Employee e =  new Employee(reader.getString("firstname"), reader.getString("lastname"), reader.getDouble("height"), reader.getInt("weight"), reader.getInt("salary"), reader.getDate("birthDate").toLocalDate());
       e.setId(reader.getString("id"));
       return e;
    }
    
    public static Company getCompany(ResultSet reader) throws SQLException {
        Employee empl = new Employee(reader.getString("e.firstname"), reader.getString("e.lastname"), reader.getDouble("e.height"), reader.getInt("e.weight"), reader.getInt("e.salary"), reader.getDate("e.birthDate").toLocalDate());
        empl.setId(reader.getString("employeeId"));
                    
        Company comp = new Company(reader.getString("companyName"), empl);
        comp.setId(reader.getString("companyId"));
        return comp;
    }
}
