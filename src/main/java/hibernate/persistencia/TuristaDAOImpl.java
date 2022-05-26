

package hibernate.persistencia;

import hibernate.model.Turista;
import java.util.List;

public class TuristaDAOImpl  extends GenericDAOImpl<Turista> implements TuristaDAO {

        public List<Turista> buscaTuristaId(int id){            
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            List<Turista> lista = sessao.createQuery("from Turista where id = " + id).list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
