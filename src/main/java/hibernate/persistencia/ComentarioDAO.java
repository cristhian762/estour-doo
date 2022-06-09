

package hibernate.persistencia;

import hibernate.model.Comentario;
import java.util.List;

public interface ComentarioDAO extends GenericDAO<Comentario> {
    
       public List<Comentario> buscaComentarioid(int id);
}
