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
public class Comerciante extends Pessoa{

    public Comerciante(List<String> com) {
        super(com.get(1), com.get(2), com.get(3), com.get(4));
        this.cnpj = com.get(5);
    }
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public Comerciante setCnpj(String cnpj) {
        this.cnpj = cnpj;
        
        return this;
    }
}
