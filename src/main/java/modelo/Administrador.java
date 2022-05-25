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
public class Administrador extends Pessoa {

    public Administrador(List<String> adm) {
        super(adm.get(1), adm.get(2), adm.get(3), adm.get(4));
    }
    
}
