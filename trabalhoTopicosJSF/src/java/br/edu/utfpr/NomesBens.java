
package br.edu.utfpr;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name="nomesBens")
@SessionScoped
public class NomesBens {
    
    private String nome;    
    private String sobreNome;
    private String mensagem;
    
    
    public String getNome() {
        
            return nome;
        
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void dizerOla(){
        mensagem = "Olá "+ nome + " " + sobreNome;
    }
    
    public String contador(){
         if(nome.length() <3 && nome.length() >10){
            return "Nome tem que ter entre 3 e 10 letrasss";
        }else{
            return nome;
        }
    }
}
