

package hibernate.persistencia;

import hibernate.model.Categoria;
import java.util.List;

public interface CategoriaDAO extends GenericDAO<Categoria> {
    
       public List<Categoria> buscaCategoriaId(int id);
}
