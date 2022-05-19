

package hibernate.persistencia;

import hibernate.model.Administrador;
import java.util.List;

public interface AdministradorDAO extends GenericDAO<Administrador> {
    
       public List<Administrador> buscaAdministradorId(int id);
}
