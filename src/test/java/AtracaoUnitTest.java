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
	public void testeDaMain() {
		Atracao atracao = new Atracao();
		    
		atracao.setNome("Festa da Polenta");
		atracao.setDescricao("A Festa da Polenta é uma festa realizada na cidade de Venda Nova do Imigrante, no bairro Santa Cruz, sempre na primeira e segunda semana de Outubro. Todo ano, a preparação para a festa começa em Março, com o Plantio do Milho, em Bananeiras, na propriedade do Sr Ambrósio Falchetto.");
		atracao.setDataInicio("06/10/22");
		atracao.setDataFim("15/10/22");
		
		System.out.println(atracao.getDescricao());
	}
}
