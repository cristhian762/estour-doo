/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.Avaliacao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import hibernate.model.Administrador;
import hibernate.model.Comentario;

/**
 *
 * @author 20191BSI0077
 */
public class ComentarioUnitTest {

	public ComentarioUnitTest() {
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
		Administrador adm = new Administrador();
		
		Comentario comentario = new Comentario();
		
		comentario.addObserver(adm); 

		adm.comNome("Amanda");

		comentario.setDescricao("Lugar perfeito!");
	}
}
