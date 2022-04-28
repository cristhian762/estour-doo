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
public class FabricaPessoa {
    public static Ipessoa gerarPessoa(char tipo){
        
        switch (tipo) {
            case 'a':
                return new Administrador();
            case 't':
                return new  Turista();
            case 'c':
                return new Comerciante();
            default:
                break;
        }
        return null;
    }
}
