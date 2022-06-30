/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@Table(name = "comercio")

public class Comercio {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private String nome;
	private String descripcao;

	public String getNome() {
		return nome;
	}

	public Comercio setDescripcao(String descripcao) {
		this.descripcao = descripcao;

		return this;
	}

	public String getDescripcao() {
		return descripcao;
	}
}
