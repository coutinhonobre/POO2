package com.github.coutinhonobre.entities;

import java.util.Date;
import java.util.List;

public class Projeto {
	
	private String nome;
	private Date dtInicio;
	private Date dtTermino;
	private List<Contratacao> contratacoes = new ArrayList<Contratacao>();
	
	
	public Projeto(String nome, Date dtInicio, Date dtTermino) {
		this.nome = nome;
		this.dtInicio = dtInicio;
		this.dtTermino = dtTermino;
	}
	
	
	public boolean adicionaContratacao(Contratacao contratacao) {
		contratacoes.add(contratacao);
		return true;
	}
	
	
	public boolean removeContacao(Contratacao contracao) {
		contratacoes.remove(contratacao);
		return true;
	}
	
	public void listarContratacao() {
		for(Contratacao contratacao : contratacoes) {
			System.out.println(contratacao.toString());
		}
	}

}