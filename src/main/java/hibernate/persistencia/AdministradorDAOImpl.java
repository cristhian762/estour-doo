

package hibernate.persistencia;

import hibernate.model.Administrador;
import java.util.List;

public class AdministradorDAOImpl extends GenericDAOImpl<Administrador> implements AdministradorDAO {

	@Override
	public List<Administrador> buscaAdministradorId(int id) {
		sessao = HibernateUtil.getSession();
		transacao = sessao.beginTransaction();
		List<Administrador> lista = sessao.createQuery("from Administrador where id = " + id).list();
		transacao.commit();
		sessao.close();
		return lista;
	}

}
