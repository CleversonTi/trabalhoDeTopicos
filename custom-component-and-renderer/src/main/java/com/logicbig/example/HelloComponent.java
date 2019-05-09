package com.logicbig.example;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;

@FacesComponent(value = "GreetingComponent", createTag = true,
        tagName = "helloComponent", namespace = "http://example.com/tags")
public class HelloComponent extends UIComponentBase {

    public HelloComponent() {
        setRendererType("GreetingComponent");
    }

    @Override
    public String getFamily() {
        return "Greeting";
    }
}