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
public class FabricaPessoa {
    public static Pessoa gerarPessoa(String tipo, String nome, String email, String senha, String img){
        
        switch (tipo) {
            case "a":
                return new Administrador(nome, email, senha, img);
            case "t":
                return new  Turista(nome, email, senha, img);
            case "c":
                return new Comerciante(nome, email, senha, img);
            default:
                break;
        }
        return null;
    }
}
