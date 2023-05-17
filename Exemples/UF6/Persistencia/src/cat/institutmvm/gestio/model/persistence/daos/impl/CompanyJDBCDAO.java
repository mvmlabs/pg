package cat.institutmvm.gestio.model.persistence.daos.impl;

import cat.institutmvm.gestio.model.business.entities.Company;
import cat.institutmvm.gestio.model.business.entities.Employee;
import cat.institutmvm.gestio.model.persistence.daos.contracts.CompanyDAO;
import cat.institutmvm.gestio.model.persistence.exceptions.DAOException;
import cat.institutmvm.gestio.model.persistence.utils.JDBCUtils;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CompanyJDBCDAO implements CompanyDAO{

    @Override
    public Company getCompanyById(String id) throws DAOException {
       Company comp = null;
       try(var connection = JDBCUtils.openConnection();
            var sql = connection.prepareCall("CALL getCompanyById(?)")) {
            sql.setString(1, id);
            try (ResultSet reader = sql.executeQuery()) {
                if (reader.next()) {
                    // ORM: [--,--,--,--,--,--] -----> []Color
                    comp = JDBCUtils.getCompany(reader);
                }            
            }
        }
        catch (SQLException  | IOException ex) {
            //Logger
            throw new DAOException(ex);
        }
        
        return comp;
    }

    @Override
    public List<Company> getCompanies() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
