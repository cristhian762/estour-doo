

package hibernate.persistencia;

import hibernate.model.Pessoa;
import java.util.List;

public class PessoaDAOImpl  extends GenericDAOImpl<Pessoa> implements PessoaDAO {

        public List<Pessoa> buscaPessoaId(int id){            
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            List<Pessoa> lista = sessao.createQuery("from Pessoa where id = " + id).list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
