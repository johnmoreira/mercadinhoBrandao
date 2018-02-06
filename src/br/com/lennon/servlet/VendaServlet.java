package br.com.lennon.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lennon.dao.ClientesDAO;
import br.com.lennon.dao.VendasDAO;
import br.com.lennon.model.Cliente;
import br.com.lennon.model.Venda;

@WebServlet("/VendaServlet")
public class VendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	Cliente c = new Cliente();
	Venda v = new Venda();
	//Produto p = new Produto();
	ClientesDAO daoC = new ClientesDAO();
	VendasDAO daoV = new VendasDAO();
	String mensagem = null;
	List<Venda> lista = new ArrayList<>();
       
    public VendaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String acao = request.getParameter("acao");
		
		switch(acao) {
		case "registar": registar(request, response);
		break;
		case "deletar": deletar(request, response);
		break;
		case "consultar": consultar(request, response);
		break;
		case "listar": listar(request, response);
		break;
		}
	}
	
	private void registar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

			
			try {
			c.setNome(request.getParameter("clienteNome"));
			c.setSobrenome(request.getParameter("clienteSobrenome"));
			
			v.setProduto(request.getParameter("produto"));
			
			v.setValor(Double.parseDouble(request.getParameter("valor")));
			
			try {
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");					
				v.setData(df.parse(request.getParameter("data")));
			} catch (Exception e) {
				v.setData(new Date());	
			}
			
			daoC.salvar(c);
			daoV.salvar(v);
			} catch (Exception e) {
				mensagem += e.getMessage();
			}
			
			if(mensagem != null) {
				mensagem = "Ocorreu um erro, por favor tente novamente.";
			}else {
				mensagem = "Operação realizada com sucesso!";
			}
				
			request.setAttribute("mensagem", mensagem);
			RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
			rd.forward(request, response); 
			
	}
	
	private void deletar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	
	private void consultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
	
	@SuppressWarnings("unchecked")
	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		lista = daoV.Listar(v);
		request.setAttribute("listaVenda", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("listaVendas.jsp");
		rd.forward(request, response);
	}
}

/**

Venda v = new Venda();
//	Produto prod = new Produto();
	VendasDAO dao = new VendasDAO();
	
//	List<Produto> p = new ArrayList<>();
	
	
/*	for(int i= 0; i<1; i++) {
		prod.setNome(request.getParameter("nomep"));
		prod.setValor(Double.parseDouble(request.getParameter("valorp")));
		p.set (i, prod);
		v.setProduto(p);
	} 
	
	v.setProduto(request.getParameter("produto"));
	v.setValor(Double.parseDouble(request.getParameter("valor")));
	
	try {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");					
		v.setData(df.parse(request.getParameter("data")));
	} catch (Exception e) {
		v.setData(new Date());	
	}
	
	dao.salvar(v);
	
	lista = dao.Listar(v);
	request.setAttribute("listaVenda", lista);
	
	RequestDispatcher rd = request.getRequestDispatcher("listaVendas.jsp");
	rd.forward(request, response);
	
**/