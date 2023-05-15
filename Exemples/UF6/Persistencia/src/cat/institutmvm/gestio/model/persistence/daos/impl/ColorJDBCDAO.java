package cat.institutmvm.gestio.model.persistence.daos.impl;

import cat.institutmvm.gestio.model.business.entities.Color;
import cat.institutmvm.gestio.model.persistence.daos.contracts.ColorDAO;
import cat.institutmvm.gestio.model.persistence.exceptions.DAOException;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ColorJDBCDAO implements ColorDAO {

    @Override
    public Color getColorById(int id) throws DAOException {
        String server = "";
        String bbdd = "";
        String user = "";
        String password = "";
        Color color = null;
        
        try (Connection connection = DriverManager.getConnection(server + bbdd, user, password);
            PreparedStatement sentSQL = connection.prepareStatement("SELECT id, name, red, green, blue FROM colors WHERE id = ?")) {
            //CallableStatement sentSQL = connection.prepareCall("CALL getColorById(?)"))
            sentSQL.setInt(1, id);
            try (ResultSet reader = sentSQL.executeQuery()) {
                if (reader.next()) {
                    // ORM: [--,--,--,--,--,--] -----> []Color
                    color = new Color(reader.getString("name"), reader.getInt("red"), reader.getInt("green"), reader.getInt("blue"));
                    color.setId(reader.getInt("id"));
                }            
            }
        }
        catch (SQLException ex) {
            //Logger
            throw new DAOException(ex);
        }
        
        return color;
    }
    @Override
    public List<Color> getColors() throws DAOException {
        String server = "";
        String bbdd = "";
        String user = "";
        String password = "";
        List<Color> colors = new ArrayList<>();
        
        try (Connection connection = DriverManager.getConnection(server + bbdd, user, password);
             CallableStatement sentSQL = connection.prepareCall("CALL getColors()");
             ResultSet reader = sentSQL.executeQuery()) {
            
                while (reader.next()) {
                    // ORM: [--,--,--,--,--,--] -----> []Color
                    var color = new Color(reader.getString("name"), reader.getInt("red"), reader.getInt("green"), reader.getInt("blue"));
                    color.setId(reader.getInt("id"));
                    colors.add(color);
                }            
        }
        catch (SQLException ex) {
            //Logger
            throw new DAOException(ex);
        }
        
        return colors;
    }
    
}
