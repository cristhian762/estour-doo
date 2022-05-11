

package hibernate.persistencia;

import hibernate.model.Pessoa;
import java.util.List;

public interface PessoaDAO extends GenericDAO<Pessoa> {
    
       public List<Pessoa> buscaPessoaId(int id);
       
    
}
