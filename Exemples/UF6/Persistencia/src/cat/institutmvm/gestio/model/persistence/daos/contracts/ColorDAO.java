package cat.institutmvm.gestio.model.persistence.daos.contracts;

import cat.institutmvm.gestio.model.business.entities.Color;
import cat.institutmvm.gestio.model.persistence.exceptions.DAOException;
import java.util.List;

public interface ColorDAO {
    Color getColorById(int id) throws DAOException;
    List<Color> getColors() throws DAOException;
}
