

package hibernate.persistencia;

import hibernate.model.Turista;
import java.util.List;

public interface TuristaDAO extends GenericDAO<Turista> {
    
       public List<Turista> buscaTuristaId(int id);
}
