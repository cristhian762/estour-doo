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
 * @author 20181BSI0229
 */

@Entity
@Table(name = "comerciante")

public class Comerciante extends Pessoa implements Observer {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")

	private int id;

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public Comerciante comCnpj(String cnpj) {
        this.cnpj = cnpj;
        
        return this;
    }

    @Override
    public void update(Observable ob) {
        Atracao event = (Atracao) ob;
        
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("Atração: " + event.getNome());
    }
}
