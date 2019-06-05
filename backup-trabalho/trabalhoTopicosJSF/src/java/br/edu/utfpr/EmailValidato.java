
package br.edu.utfpr;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator("emailValidato")
public class EmailValidato implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object value) throws ValidatorException {
       Pattern pattern  = Pattern.compile("\\w+@\\.\\w+");
        Matcher match = pattern.matcher(
                (CharSequence) value);
        HtmlInputText htmlInputText = (HtmlInputText) uic;
        
        String label;
        if(htmlInputText.getLabel() == null
                || htmlInputText.getLabel().trim().equals("")){
            label = htmlInputText.getId();
        }else{
            label = htmlInputText.getLabel();
        }
        
        if(match.matches()){
            FacesMessage facesMessage = new FacesMessage(label + ": Email não valido");
            throw new ValidatorException(facesMessage);
        }
        
    }
    
}
