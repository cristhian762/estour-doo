package hibernate.persistencia;

import hibernate.model.Comercio;
import java.util.List;

public class ComercioDAOImpl  extends GenericDAOImpl<Comercio> implements ComercioDAO {

        public List<Comercio> buscaComercioCnpj(String cnpj){            
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();                        
            List<Comercio> lista = sessao.createQuery("from comercio where cnpj = '" + cnpj + "'").list();
            transacao.commit();            
            sessao.close();
            return lista;
        }
    
}
