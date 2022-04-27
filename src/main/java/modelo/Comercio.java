/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 20181BSI0229
 */
public class Comercio {
   private String nome;
   private String descripcao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
   
    public void setDescripcao(String descripcao) {
        this.descripcao = descripcao;
    }

    public String getDescripcao() {
        return descripcao;
    }
}
