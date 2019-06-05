
package br.edu.utfpr;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "cpf")
@SessionScoped
public class CPF implements Serializable{
 private static final long serialVersionUID = 1L;

  private String numero;

  

  public CPF(String numero){

    this.numero = numero;

  }

  public String toString() {

    return numero;

  }

}