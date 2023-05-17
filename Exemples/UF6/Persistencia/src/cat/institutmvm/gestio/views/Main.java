
package cat.institutmvm.gestio.views;

import cat.institutmvm.gestio.model.business.entities.Color;
import cat.institutmvm.gestio.model.business.entities.Company;
import cat.institutmvm.gestio.model.business.entities.Employee;
import cat.institutmvm.gestio.model.persistence.daos.impl.ColorJDBCDAO;
import cat.institutmvm.gestio.model.persistence.daos.impl.CompanyJDBCDAO;
import cat.institutmvm.gestio.model.persistence.daos.impl.EmployeeJDBCDAO;
import cat.institutmvm.gestio.model.persistence.exceptions.DAOException;

public class Main {
    public static void main(String[] args) {
        ColorJDBCDAO colorDAO = new ColorJDBCDAO();
        
        try {
            Color c = colorDAO.getColorById(5);
            if (c != null) {
                System.out.println(c.toString());
            }            
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }
        
        EmployeeJDBCDAO emplDAO = new EmployeeJDBCDAO();
        
        try {
            Employee e = emplDAO.getEmployeeById("E001");
            if (e != null) {
                System.out.println(e.toString());
            }            
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }
        
        CompanyJDBCDAO compDAO = new CompanyJDBCDAO();
        
        try {
            Company comp = compDAO.getCompanyById("C001");
            if (comp != null) {
                System.out.println(comp.toString());
            }            
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }
    
    }
}
