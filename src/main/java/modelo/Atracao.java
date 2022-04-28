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
public class Atracao {
    private String nome;
    private String descricao;
    private String dataFim;
    private String dataInicio;

    public String getNome() {
        return nome;
    }

    public Atracao setNome(String nome) {
        this.nome = nome;

        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Atracao setDescricao(String descricao) {
        this.descricao = descricao;

        return this;
    }

    public String getDataFim() {
        return dataFim;
    }

    public Atracao setDataFim(String dataFim) {
        this.dataFim = dataFim;

        return this;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public Atracao setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;

        return this;
    }
    
    
}
