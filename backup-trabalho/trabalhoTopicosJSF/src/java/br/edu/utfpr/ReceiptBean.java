package br.edu.utfpr;
import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean(name="receipt")
@SessionScoped
public class ReceiptBean implements Serializable{

	Date date = new Date();
        String locale ="pt_BR";
        
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
        
        public String getLocale() {
            return this.locale;
        }

}