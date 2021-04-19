package br.edu.insper.desagil.pi;

public class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Double getPreco() {
		return this.preco;
	}
}
