
package hibernate.persistencia;

import hibernate.model.Comercio;
import java.util.List;

public interface ComercioDAO extends GenericDAO<Comercio> {
    
       public List<Comercio> buscaComercioCnpj(String cnpj);
}
