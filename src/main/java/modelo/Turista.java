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
public class Turista extends Pessoa {

    private String cpf;
    
    public Turista(String nome, String email, String senha, String img) {
        super(nome, email, senha, img);
        // this.nome = turista.get(5);
    }

    public String getCpf() {
        return cpf;
    }

    public Turista setCpf(String cpf) {
        this.cpf = cpf;

        return this;
    }
}
