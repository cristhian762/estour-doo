

package hibernate.persistencia;

import hibernate.model.Categoria;
import java.util.List;

public class CategoriaDAOImpl  extends GenericDAOImpl<Categoria> implements CategoriaDAO {

        public List<Categoria> buscaCategoriaId(int id){            
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            List<Categoria> lista = sessao.createQuery("from Categoria where id = " + id).list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
