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
@Table(name = "atracao")

public class Comentario {
    
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
        
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Comentario setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}
