package br.edu.utfpr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean

public class ApplicaScope implements Serializable {

    private String name;

    private int num = 0;

    private List<String> nomes = new ArrayList<String>();

    public String addNome() {
        this.num++;
        String contador = String.valueOf(num);
        nomes.add("Nome " + contador);
        nomes.add(name);
        return "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

}
