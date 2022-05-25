/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author 20181BSI0229
 */
public class Turista extends Pessoa {

    public Turista(List<String> turista) {
        super(turista.get(1), turista.get(2), turista.get(3), turista.get(4));
        // this.nome = turista.get(5);
        this.cpf = turista.get(5);
    }

    private String cpf;

    public Turista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCpf() {
        return cpf;
    }

    public Turista setCpf(String cpf) {
        this.cpf = cpf;

        return this;
    }
}
