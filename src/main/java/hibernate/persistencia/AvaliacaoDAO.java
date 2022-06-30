

package hibernate.persistencia;

import hibernate.model.Avaliacao;
import java.util.List;

public interface AvaliacaoDAO extends GenericDAO<Avaliacao> {
    
       public List<Avaliacao> buscaAvaliacaoId(int id);
}
