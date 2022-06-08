/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hibernate.model.Turista;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author 20181bsi0229
 */
public class TuristaDAOTeste {
    
    public TuristaDAOTeste() {
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
     public void hello() {
     
//        TuristaDAO dao = new TuristaDAOImpl();
        
        Turista turista = new Turista();
        
        turista.setNome("Fulado");
                
        
//        turista = dao.inserir(turista);
//        Turista criado = dao.buscaTuristaId(turista.getNome());
//        Asset.equalsObject(turista , criado);
        
         
     
     }
}
