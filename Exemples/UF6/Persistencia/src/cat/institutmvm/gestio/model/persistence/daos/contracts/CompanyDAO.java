package cat.institutmvm.gestio.model.persistence.daos.contracts;

import cat.institutmvm.gestio.model.business.entities.Company;
import cat.institutmvm.gestio.model.business.entities.Employee;
import cat.institutmvm.gestio.model.persistence.exceptions.DAOException;
import java.util.List;

public interface CompanyDAO {
    Company getCompanyById(String id) throws DAOException;
    List<Company> getCompanies() throws DAOException;
}
