/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import hibernate.model.Atracao;
import hibernate.model.Comerciante;
import hibernate.model.Turista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 20181bsi0148
 */
public class TuristaObserverTest {

	public TuristaObserverTest() {
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
		Turista turista = new Turista();
		Comerciante comerciante = new Comerciante();
		
		Atracao atracao = new Atracao(
			"Festa da polenta",
			"Uma festa com muita polenta",
			"20/04/22",
			"30/04/22"
		);
		
		atracao.addObserver(turista); 
		atracao.addObserver(comerciante); 

		turista.comCpf("223.531.990-46");		
		comerciante.comCnpj("99.562.396/0001-28");

		atracao.notifyObserver();
	}
}
