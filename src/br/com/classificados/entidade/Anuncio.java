package br.com.classificados.entidade;

import java.util.Date;

public class Anuncio {
	private int id;
	
	private String titulo;
	
	private double valor;
	
	private Date dataAnuncio;
	
	private Date dataExpiracao;
	
	private boolean situacao;
	
	private String tipo;
	
	private Secao categoria;
	
	private Assinante cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataAnuncio() {
		return dataAnuncio;
	}

	public void setDataAnuncio(Date dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
	}

	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Secao getCategoria() {
		return categoria;
	}

	public void setCategoria(Secao categoria) {
		this.categoria = categoria;
	}

	public Assinante getCliente() {
		return cliente;
	}

	public void setCliente(Assinante cliente) {
		this.cliente = cliente;
	}
	
	
}
