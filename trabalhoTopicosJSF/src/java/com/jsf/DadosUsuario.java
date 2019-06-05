/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author nasser
 */
@ManagedBean(name = "dadosUsuario")
@SessionScoped
public class DadosUsuario implements Serializable{
    
    private String nome = "Nasser";
    private int visitante = 25;
    private String mensagem = "Olá mundo! Esta é minha mensagem!";
    /**
     * Creates a new instance of DadosUsuario
     */
    
    public String getNome() {
        return this.nome;
    }
    
    public String getMensagem() {
        return this.mensagem;
    }
    
    public int getVisitante() {
        return this.visitante;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public DadosUsuario() {
    }
    
}
