package br.edu.insper.desagil.pi;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private Integer id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario, Integer> avaliacoes;
	
	public Video(Integer identificador, Usuario usuario, Produto produto) {
		this.id = identificador;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}
	
	public void adicionaAvaliacao(Usuario usuario, Integer avaliacao) {
		if (avaliacao >= 1 && avaliacao <= 5) {
			if (usuario.getNome() != this.usuario.getNome()) {
				this.avaliacoes.put(usuario, avaliacao);
			}
		}
	}
	
	public Double mediaAvaliacoes() {
		double media;
		double soma = 0;
		for (Integer avaliacao: this.avaliacoes.values()) {
			soma += (double) avaliacao;
		}
		media = Math.round(soma/this.avaliacoes.size());
		return media;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
}
