package com.logicbig.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.time.LocalDateTime;

@ManagedBean
@RequestScoped
public class HelloBean {

    public String getMessage() {
        return "Olá Amigos!";
    }

    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }
}