package br.edu.negocio;

import java.util.List;

import br.edu.entidade.Produto;

public interface ProdutoService {

	Produto findById(Integer id);

	List<Produto> list();

	void merge(Produto produto);

	void add(Produto produto);

	void remove(Produto produto);

}
