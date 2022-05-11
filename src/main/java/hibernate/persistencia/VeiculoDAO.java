

package hibernate.persistencia;

import hibernate.model.Veiculo;
import java.util.List;

/**
 *
 * @author felipe
 */
public interface VeiculoDAO extends GenericDAO<Veiculo> {
    
       public List<Veiculo> buscaVeiculosApartirDoAno(int ano);
       
    
}
