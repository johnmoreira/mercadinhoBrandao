package br.com.lennon.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="venda")
public class Venda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cod;
	
	private String produto;
	
	//private List<Produto> produto;
	
	private Double valor;
	
	 @Temporal(TemporalType.DATE)
	private Date data;
	 
	 
	public Venda() {
		//produto = new ArrayList<Produto>();
	}
	/*public Double calcularTotal() {
		Double total = 0.0;
		for(int i=0; i<= produto.size();i++ ) {
			total = total+(produto.get(i).getValor());
		}
		return total;	
	} 

	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	} */
	

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	} 

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
