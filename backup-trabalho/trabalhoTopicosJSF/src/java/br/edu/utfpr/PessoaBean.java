package br.edu.utfpr;

import java.awt.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;

@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	
	private HtmlCommandButton botao;
	private ArrayList<String> nomes = new ArrayList<>();
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String addNome() {
		
		return "";
	}

    public HtmlCommandButton getBotao() {
        return botao;
    }

    public void setBotao(HtmlCommandButton botao) {
        this.botao = botao;
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }
        
        
}
