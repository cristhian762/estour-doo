

package hibernate.persistencia;

import hibernate.model.Atracao;
import java.util.List;

public class AtracaoDAOImpl  extends GenericDAOImpl<Atracao> implements AtracaoDAO {

        public List<Atracao> buscaAtracaoNome(String nome){            
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            List<Atracao> lista = sessao.createQuery("from Atracao where name = '" + nome + "'").list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
