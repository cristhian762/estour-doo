/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 20181BSI0229
 */
public class testeFactory {

    public static void main(String[] args) {
        
        List<String> ademir = new ArrayList<String>();
        List<String> turistinha = new ArrayList<String>();
        Collections.addAll(ademir, "a", "Ademilton Oliveira", "ademir@gmail.com", "123456", "");
        Collections.addAll(turistinha, "t", "Turista Teste", "turista@gmail.com", "654321", "", "12345678910");

        FabricaPessoa fabricapessoa = new FabricaPessoa();
        Pessoa usuarioA = fabricapessoa.gerarPessoa(ademir);
        Pessoa usuarioT = fabricapessoa.gerarPessoa(turistinha);
    }

}

/*

if (usuarioA instanceof Turista) {
            Turista turista = (Turista) usuarioA;
            turista.getCpf();

        }

*/