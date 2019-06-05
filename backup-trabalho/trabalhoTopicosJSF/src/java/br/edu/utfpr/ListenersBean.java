/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author nadook
 */
@ManagedBean(name="listeners")
@SessionScoped
public class ListenersBean {
    
    private String nickname;
    
    public String getNickname() {
        
        return this.nickname;
    }
   
    public void envieParaIndex(ActionEvent event) {
        nickname = (String)event.getComponent().getAttributes().get("usuario");
    }
    
    public String action() {
        return "result-listener";
    }
}
