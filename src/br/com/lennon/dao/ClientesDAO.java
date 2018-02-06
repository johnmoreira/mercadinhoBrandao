package br.com.lennon.dao;

import java.util.List;

import br.com.lennon.model.Cliente;

public class ClientesDAO extends DAO {
	public void salvar(Cliente cliente) {
		super.salvar(cliente);
    }
	
	public void deletar(Long cod, Cliente cliente) {
		super.deletar(cod, cliente);
	}

	public Cliente consultar(Long cod, Cliente cliente) {
		return (Cliente) super.consultar(cod, cliente);
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> listar(Cliente cliente){
		return super.Listar(cliente);
	}
}