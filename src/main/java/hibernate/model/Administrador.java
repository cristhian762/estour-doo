/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author 20191BSI0077
 */

@Entity
@Table(name = "administrador")
   
public class Administrador extends Pessoa implements Ipessoa, Observer {
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
    
    private int id;

    @Override
    public void update(Observable ob) {
        Comentario event = (Comentario) ob;
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("Comentário: " + event.getDescricao());
    }
}
