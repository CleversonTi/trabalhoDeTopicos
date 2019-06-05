package br.com.crudjsf.mbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import br.com.crudjsf.modelo.Produto;
import br.com.crudjsf.negocio.ProdutoService;
import br.com.crudjsf.negocio.ProdutoServiceImplMock;

@ManagedBean
public class ProdutoMBean {
	
	private ProdutoService produtoService = new ProdutoServiceImplMock();
	
	private Produto produto;
		
	public ProdutoMBean() {
		if (produto == null) {
			// obtem parametro
			ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
	        String idParam = ctx.getRequestParameterMap().get("id");

			if (idParam != null && !idParam.equals("")) {
				try {
					this.produto = produtoService.findById(Integer.parseInt(idParam));
				} catch(NumberFormatException e) {
					// log 
				}
			} 
			
			if (this.produto == null) {
				this.produto = new Produto();
			}
		}
	}
	
	public Produto getProduto() {			
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getLista() {
		return produtoService.list();
	}
	
	public String editar() {
		produtoService.merge(produto);
		return "show";
	}
	
	public String adicionar() {
		produtoService.add(produto);
		return "show";
	}
	
	public void remover() {
		produtoService.remove(produto);
	}
}
