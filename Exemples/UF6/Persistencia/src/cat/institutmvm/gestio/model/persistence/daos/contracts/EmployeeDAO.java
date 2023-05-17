package cat.institutmvm.gestio.model.persistence.daos.contracts;

import cat.institutmvm.gestio.model.business.entities.Employee;
import cat.institutmvm.gestio.model.persistence.exceptions.DAOException;
import java.util.List;

public interface EmployeeDAO {
    Employee getEmployeeById(String id) throws DAOException;
    List<Employee> getEmployees() throws DAOException;
}
