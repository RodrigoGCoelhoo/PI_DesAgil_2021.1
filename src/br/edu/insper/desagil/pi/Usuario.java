package br.edu.insper.desagil.pi;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}
	
	public Video postaVideo(Integer id, Produto produto) {
		Video video = new Video(id, this, produto);
		this.videos.add(video);
		return video;
	}
	
	public Double totalAvaliacoes() {
		double soma = 0;
		for (Video video: this.videos) {
			soma += video.mediaAvaliacoes();
		}
		return soma;
	}
	
	public String getNome() {
		return this.nome;
	}
}
