package br.edu.insper.desagil.pi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RedeSocialTest {

	private static double DELTA = 0.01;
	private Usuario usuarioPost;
	private Produto produto;
	private Video video;
	
	@BeforeEach
	public void setUp() {
		usuarioPost = new Usuario("Rodrigo");
		produto = new Produto("Mesa redonda", 2560.50);
		video = new Video(1, usuarioPost, produto);
	}
	
	@Test
	void avaliacoesInvalidas() {
		video.adicionaAvaliacao(new Usuario("John"), 6);
		video.adicionaAvaliacao(new Usuario("Snow"), 0);
		
		assertEquals(0, video.mediaAvaliacoes());
	}
	
	@Test
	void avaliacaoValida() {
		video.adicionaAvaliacao(new Usuario("Pedro"), 5);
		
		assertEquals(5, video.mediaAvaliacoes());
	}
	
	@Test
	void duasAvaliacoesValidas() {
		video.adicionaAvaliacao(new Usuario("Pedro"), 3);
		video.adicionaAvaliacao(new Usuario("Mara"), 4);
		
		assertEquals(4, video.mediaAvaliacoes());
	}
	
	@Test
	void tresAvaliacoesValidas() {
		video.adicionaAvaliacao(new Usuario("Pedro"), 4);
		video.adicionaAvaliacao(new Usuario("Mara"), 5);
		video.adicionaAvaliacao(new Usuario("Ricardo"), 1);
		
		assertEquals(3, video.mediaAvaliacoes());
	}
	
	@Test
	void doisVideos() {
		video.adicionaAvaliacao(new Usuario("Pedro"), 4);
		video.adicionaAvaliacao(new Usuario("Mara"), 5);
		
		Video video2 = new Video(2, usuarioPost, produto);
		
		video2.adicionaAvaliacao(new Usuario("Ricardo"), 1);
		
		assertEquals(5, video.mediaAvaliacoes());
		assertEquals(1, video2.mediaAvaliacoes());
		
	}

}
