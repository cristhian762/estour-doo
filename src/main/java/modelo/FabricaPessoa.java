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
    public static Pessoa gerarPessoa(List<String> usuario){
        
        switch (usuario.get(0)) {
            case "a":
                return new Administrador(usuario);
            case "t":
                return new  Turista(usuario);
            case "c":
                return new Comerciante(usuario);
            default:
                break;
        }
        return null;
    }
}
