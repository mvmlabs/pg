
package cat.institutmvm.gestio.views;

import cat.institutmvm.gestio.model.business.entities.Color;
import cat.institutmvm.gestio.model.persistence.daos.impl.ColorJDBCDAO;
import cat.institutmvm.gestio.model.persistence.exceptions.DAOException;
import java.util.List;

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
        
        try {
            List<Color> colors = colorDAO.getColors();
            for (Color c : colors) {
                System.out.println(c.toString());
            }
            
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }
    
    }
}
