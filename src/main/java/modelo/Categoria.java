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
public class Categoria {
    private String nome;

    public Categoria setNome(String nome) {
        this.nome = nome;

        return this;
    }

    public String getNome() {
        return nome;
    }
}
