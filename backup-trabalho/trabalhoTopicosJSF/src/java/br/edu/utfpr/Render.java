/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author nadook
 */
@ManagedBean
@SessionScoped
public class Render {
    private String userName="";
    private boolean logged = false;
    
    public Render() {
    }
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void login() {
        this.logged=true;
    }
    
    public boolean loggedIn() {
        return this.logged;
    }
    
    public void logout() {
        this.logged=false;
        this.userName="";
    }
    
}
