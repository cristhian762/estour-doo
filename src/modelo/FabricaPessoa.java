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
        
        if(tipo == 'a'){
            Administrador usuario = null;
            Administrador usuario = new Administrador();
        } else if(tipo == 't'){
            Turista usuario = null;
            Turista usuario = new Turista();
        }else if(tipo == 'c'){
            Comerciante usuario = null;
            Comerciante usuario = new Comerciante();
        }
        return usuario;
    }
}
