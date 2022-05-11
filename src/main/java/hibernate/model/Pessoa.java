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
@Table(name = "pessoa")
   
public class Pessoa {
    @Id
    @GeneratedValue(generator = "increment")    
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;
    
    private String nome;
    private String email;
    private String senha;
    private String img;

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Pessoa setEmail(String email) {
        this.email = email;
        
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Pessoa setSenha(String senha) {
        this.senha = senha;
        
        return this;
    }

    public String getImg() {
        return img;
    }

    public Pessoa setImg(String img) {
        this.img = img;
        
        return this;
    }
}
