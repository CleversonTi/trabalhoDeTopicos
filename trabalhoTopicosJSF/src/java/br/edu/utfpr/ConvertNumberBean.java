package br.edu.utfpr;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "convertNumberBean")
@SessionScoped
public class ConvertNumberBean implements Serializable {

    private double valor = 10;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
