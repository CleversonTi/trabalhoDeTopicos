/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crudjsf.modelo;

public class Produto {

	private Integer id;
	
	private String nome;
	
	private String descricao;
	private String cifrao;
	private Float preco;

	public Produto() {		
	}
	
	public Produto(Integer id, String nome, String descricao,String cifrao, Float preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
                this.cifrao = cifrao;
		this.preco = preco;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

    public String getCifrao() {
        return cifrao;
    }

    public void setCifrao(String cifrao) {
        this.cifrao = cifrao;
    }
        
}
