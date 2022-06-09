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
public class Comerciante extends Pessoa{

    private String cnpj;
    
    public Comerciante(String nome, String email, String senha, String img) {
        super(nome, email, senha, img);
    }

    public String getCnpj() {
        return cnpj;
    }

    public Comerciante setCnpj(String cnpj) {
        this.cnpj = cnpj;
        
        return this;
    }
}
