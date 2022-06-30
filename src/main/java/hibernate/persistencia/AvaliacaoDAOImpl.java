

package hibernate.persistencia;

import hibernate.model.Avaliacao;
import java.util.List;

public class AvaliacaoDAOImpl  extends GenericDAOImpl<Avaliacao> implements AvaliacaoDAO {

        public List<Avaliacao> buscaAvaliacaoId(int id){            
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            List<Avaliacao> lista = sessao.createQuery("from avaliacao where id = '" + id + "'").list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
