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
public class PontoTuristico {
    private String nome;
    private String descricao;

    public PontoTuristico setNome(String nome) {
        this.nome = nome;

        return this;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public PontoTuristico setDescricao(String descricao) {
        this.descricao = descricao;

        return this;
    }
}
