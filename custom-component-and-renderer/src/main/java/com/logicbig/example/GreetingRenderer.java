package com.logicbig.example;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;
import javax.faces.render.Renderer;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Map;

@FacesRenderer(componentFamily = "Greeting", rendererType = "GreetingComponent")
public class GreetingRenderer extends Renderer {

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        Map<String, Object> attributes = component.getAttributes();
        String message = (String) attributes.get("message");
        LocalDateTime time = (LocalDateTime) attributes.get("time");
        String formattedTime = time.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));

        ResponseWriter writer = context.getResponseWriter();
        writer.startElement("div class='Teste'", component);
        writer.write("Message: " + message);
        writer.endElement("div");

        writer.startElement("div", component);
        writer.write("Data/Hora: " + formattedTime);
        writer.endElement("div");
    }
}