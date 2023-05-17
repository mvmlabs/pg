package cat.institutmvm.gestio.model.persistence.daos.impl;

import cat.institutmvm.gestio.model.business.entities.Color;
import cat.institutmvm.gestio.model.persistence.daos.contracts.ColorDAO;
import cat.institutmvm.gestio.model.persistence.exceptions.DAOException;
import cat.institutmvm.gestio.model.persistence.utils.JDBCUtils;
import java.io.IOException;
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
        Color color = null;
        
        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("SELECT id, name, red, green, blue FROM colors WHERE id = ?")) {
            //CallableStatement sentSQL = connection.prepareCall("CALL getColorById(?)"))
            sentSQL.setInt(1, id);
            try (ResultSet reader = sentSQL.executeQuery()) {
                if (reader.next()) {
                    // ORM: [--,--,--,--,--,--] -----> []Color
                    color = JDBCUtils.getColor(reader);
                }            
            }
        }
        catch (SQLException  | IOException ex) {
            //Logger
            throw new DAOException(ex);
        }
        
        return color;
    }
    @Override
    public List<Color> getColors() throws DAOException {
        List<Color> colors = new ArrayList<>();
        
        try (Connection connection = JDBCUtils.openConnection();
             CallableStatement sentSQL = connection.prepareCall("CALL getColors()");
             ResultSet reader = sentSQL.executeQuery()) {
            
                while (reader.next()) {
                    // ORM: [--,--,--,--,--,--] -----> []Color
                    colors.add(JDBCUtils.getColor(reader));
                }            
        }
        catch (SQLException | IOException ex) {
            //Logger
            throw new DAOException(ex);
        }
        
        return colors;
    }
}
