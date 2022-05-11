/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.Administrador;
import modelo.Atracao;
import modelo.Avaliacao;
import modelo.Categoria;
import modelo.Comentario;
import modelo.Comercio;
import modelo.Endereco;
import modelo.FabricaPessoa;
import modelo.Pessoa;
import modelo.PontoTuristico;
import modelo.Turista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20191BSI0077
 */
public class IPessoaUnitTest {

	public IPessoaUnitTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	@Test
	public void testeDaMain() {
            Administrador admin = (Administrador) FabricaPessoa.gerarPessoa('a');
            
            admin.setNome("Arman Moreno Trindade")
                .setEmail("ArmanMoreno@gmail.com")
                .setSenha("qwerty@123")
                .setImg("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Breezeicons-actions-22-im-user.svg/1200px-Breezeicons-actions-22-im-user.svg.png");
        
            System.out.println(admin.getEmail() + "  " + admin.getSenha());
        }
}
