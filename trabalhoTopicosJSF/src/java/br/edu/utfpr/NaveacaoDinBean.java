/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author clevi
 */
@ManagedBean
@ViewScoped
public class NaveacaoDinBean {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String escolherPagina() {
        if (nome.equals("a")) {
            return "resultadoNavDin";
        } else if (nome.equals("b")) {
            return "convertDate";
        } else {
            return "";
        }
    }
}
