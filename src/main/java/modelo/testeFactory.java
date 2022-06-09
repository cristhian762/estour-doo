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
public class testeFactory {

    public static void main(String[] args) {
        
        String tipo;
        FabricaPessoa fabricapessoa = new FabricaPessoa(); 
        
        tipo = "a";
        Pessoa usuarioA = FabricaPessoa.gerarPessoa(tipo, "Ademilton Oliveira", "ademir@gmail.com", "123456", "");
        
        tipo = "t";
        Pessoa usuarioT = FabricaPessoa.gerarPessoa(tipo, "Turista Teste", "turista@gmail.com", "654321", "");
        
    }

}

/*

if (usuarioA instanceof Turista) {
            Turista turista = (Turista) usuarioA;
            turista.getCpf();

        }

*/