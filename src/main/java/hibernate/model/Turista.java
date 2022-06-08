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
import java.util.List;

/**
 *
 * @author 20181BSI0229
 */

@Entity
@Table(name = "turista")

public class Turista extends Pessoa implements Ipessoa{

    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public Turista setCpf(String cpf) {
        this.cpf = cpf;

        return this;
    }
}
