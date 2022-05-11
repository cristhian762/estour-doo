

import hibernate.model.Pessoa;
import hibernate.persistencia.PessoaDAO;
import hibernate.persistencia.PessoaDAOImpl;
import java.util.List;


public class Main {    		
	public static void main(String[] args) throws Exception {                                    

           PessoaDAO PessoaDAO = new PessoaDAOImpl();            
           Pessoa pessoa = new Pessoa();
           pessoa.setNome("Cristhian")
                   .setEmail("cristhian@gmail.com")
                   .setSenha("senha123")
                   .setImg("https://image.com/4561");
           
           
           PessoaDAO.inserir(pessoa);           
           List<Pessoa> listar = PessoaDAO.listar(Pessoa.class);
           
           System.out.println(listar);
           
            
	}                
}
