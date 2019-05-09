package controller;

import com.sun.istack.internal.NotNull;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.validator.BeanValidator;
import javax.faces.context.FacesContext;
import static javax.swing.text.StyleConstants.Size;



@ManagedBean(name = "contaController")
@SessionScoped
public class ContaController {
    
    
    private String nome;
    private String senha;

    @Size(min = 3, max = 20)
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String Registrar() {

        return "sucesso?faces redireciona=true";
    }

}
