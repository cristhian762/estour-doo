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
 * @author 20181BSI0148
 */

@Entity
@Table(name = "atracao")
   

public class Atracao {
    
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
    
    private int id;
     
    private String nome;
    private String descricao;
    private String dataFim;
    private String dataInicio;

    public String getNome() {
        return nome;
    }

    public Atracao comNome(String nome) {
        this.nome = nome;

        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Atracao comDescricao(String descricao) {
        this.descricao = descricao;

        return this;
    }

    public String getDataFim() {
        return dataFim;
    }

    public Atracao comDataFim(String dataFim) {
        this.dataFim = dataFim;

        return this;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public Atracao comDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;

        return this;
    }
}
