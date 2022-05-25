/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import hibernate.persistencia.AtracaoDAO;
import hibernate.persistencia.AtracaoDAOImpl;
import modelo.Administrador;
import modelo.Atracao;
import modelo.Avaliacao;
import modelo.Categoria;
import modelo.Comentario;
import modelo.Comercio;
import modelo.Endereco;
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
 * @author 20181bsi0148
 */
public class AtracaoUnitTest {

	public AtracaoUnitTest() {
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
	public void testeDaMain() throws Exception {
		AtracaoDAO atracaoDao = new AtracaoDAOImpl();
		hibernate.model.Atracao atracao = new hibernate.model.Atracao();
		
		atracao.setNome("Festa da Polenta");
		atracao.setDescricao("Eh uma festa bem legal e que tem bastante polenta hm delicia");
		atracao.setDataInicio("13/10/2022");
		atracao.setDataFim("20/10/2022");
		
		atracaoDao.inserir(atracao);

		System.out.println(atracao);
	}
}
