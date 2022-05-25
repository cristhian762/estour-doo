

package hibernate.persistencia;

import hibernate.model.Atracao;
import java.util.List;

public interface AtracaoDAO extends GenericDAO<Atracao> {
    
       public List<Atracao> buscaAtracaoNome(String nome);
}
