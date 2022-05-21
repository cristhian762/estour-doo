/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hibernate.model.*;
import hibernate.persistencia.*;
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
public class AdministradorUnitTest {

	public AdministradorUnitTest() {
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
		AdministradorDAO adminDao = new AdministradorDAOImpl();
		Administrador admin = new Administrador();
		
		admin.setNome("Administrador");
		admin.setEmail("administrador@estour.com.br");
		admin.setSenha("pass@123");
		admin.setImg("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Breezeicons-actions-22-im-user.svg/1200px-Breezeicons-actions-22-im-user.svg.png");
		
		adminDao.inserir(admin);

		System.out.println(admin);
	}
}
