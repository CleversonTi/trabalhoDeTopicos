package br.com.crudjsf.negocio;

import java.util.ArrayList;
import java.util.List;

import br.com.crudjsf.entidade.Produto;

public class ProdutoServiceImplMock implements ProdutoService {
	
	private List<Produto> tabelaProdutoMock = new ArrayList<Produto>();
	
	public ProdutoServiceImplMock() {
		Produto a = new Produto(1, "Amaciante Confort", "Amaciante de Roupas", 5.90f);
		Produto b = new Produto(2, "Boneco Fred Flinstones", "Boneco de pelúcia do personagem Fred Flinstones", 35.50f);
		Produto c = new Produto(3, "Notebook Sony Vaio Ci3 4 GB", "Nootebook VAIO Branco 13\'", 2700f);
		Produto d = new Produto(4, "George Foreman Grill", "Grill grande para carnes e legumes com som embutido.", 399f);
		
		tabelaProdutoMock.add(a);
		tabelaProdutoMock.add(b);
		tabelaProdutoMock.add(c);
		tabelaProdutoMock.add(d);
	}
	
	@Override
	public Produto findById(Integer id) {
		if (id >= 1 && id <=4) {
			return tabelaProdutoMock.get(id-1);
		} else {
			return null;
		}
	}
	
	@Override
	public List<Produto> list() {
		return tabelaProdutoMock;
	}
	
	@Override
	public void merge(Produto produto) {
		// Atualiza produto
	}

	@Override
	public void add(Produto produto) {
		// Adiciona produto
		
	}

	@Override
	public void remove(Produto produto) {
		// remove produto
		
	}
}
