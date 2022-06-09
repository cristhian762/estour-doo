/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import hibernate.persistencia.AtracaoDAO;
import hibernate.persistencia.AtracaoDAOImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
		
		atracao.comNome("Festa da Polenta")
		.comDescricao("Eh uma festa bem legal e que tem bastante polenta hm delicia")
		.comDataInicio("13/10/2022")
		.comDataFim("20/10/2022");
		
		atracaoDao.inserir(atracao);

		System.out.println(atracao);
	}
}
