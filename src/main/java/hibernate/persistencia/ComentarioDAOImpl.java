package hibernate.persistencia;

import hibernate.model.Comentario;
import hibernate.model.Comentario;
import hibernate.model.Comentario;
import java.util.List;

public class ComentarioDAOImpl extends GenericDAOImpl<Comentario> implements ComentarioDAO {

    @Override
    public List<Comentario> buscaComentarioid(int id) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List<Comentario> lista = sessao.createQuery("from Comentario  where id = " + id).list();
        transacao.commit();
        sessao.close();
        return lista;
    }

}
