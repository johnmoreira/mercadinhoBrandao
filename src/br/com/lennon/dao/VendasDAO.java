package br.com.lennon.dao;

import java.util.List;

import br.com.lennon.model.Venda;

public class VendasDAO extends DAO {
	
	public void salvar(Venda venda) {
		super.salvar(venda);
    }
	
	public void deletar(Long cod, Venda venda) {
		super.deletar(cod, venda);
	}

	public Venda consultar(Long cod, Venda venda) {
		return (Venda) super.consultar(cod, venda);
	}
	
	@SuppressWarnings("unchecked")
	public List<Venda> listar(Venda venda){
		return super.Listar(venda);
	}
}