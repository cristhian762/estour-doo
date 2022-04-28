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
public class AvaliacaoUnitTest {

	public AvaliacaoUnitTest() {
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
		Avaliacao avaliacao = new Avaliacao();
		    
		avaliacao.setNota((float) 4.3);
		
		System.out.println(avaliacao.getNota());
	}
}
