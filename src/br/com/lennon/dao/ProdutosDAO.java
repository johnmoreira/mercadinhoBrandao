package br.com.lennon.dao;

import java.util.List;

import br.com.lennon.model.Produto;

public class ProdutosDAO extends DAO {
	public void salvar(Produto produto) {
		super.salvar(produto);
    }
	
	public void deletar(Long cod, Produto produto) {
		super.deletar(cod, produto);
	}

	public Produto consultar(Long cod, Produto produto) {
		return (Produto) super.consultar(cod, produto);
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> listar(Produto produto){
		return super.Listar(produto);
	}
}