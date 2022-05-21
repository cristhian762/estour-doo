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
import modelo.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author 20191BSI0077
 */

@Entity
@Table(name = "administrador")
   
public class Administrador extends Pessoa implements Ipessoa{
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;
}
