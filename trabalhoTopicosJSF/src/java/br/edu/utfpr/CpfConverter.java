package br.edu.utfpr;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
 
@FacesConverter("cpfConverter")
public class CpfConverter implements Converter {
  
      public Object getAsObject(FacesContext facesContext, 
      UIComponent component, String valor) {
            String semPontuacao = valor.replaceAll("\\.|-", ""); 
            //removendo pontos e traços
            return semPontuacao;
      }
  
      public String getAsString(FacesContext facesContext, 
      UIComponent component, Object objeto) {
            String cpf = (String) objeto;
            cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "."
            + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
            return cpf;
      }
  
}