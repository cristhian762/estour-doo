

package hibernate.persistencia;

import hibernate.model.Comerciante;
import java.util.List;

public interface ComercianteDAO extends GenericDAO<Comerciante> {
    
       public List<Comerciante> buscaComercianteCnpj(String cpj);
}
