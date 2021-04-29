package com.github.coutinhonobre.entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

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
		return contratacoes.add(contratacao);
	}
	
	
	public boolean removeContacao(Contratacao contracao) {
		return contratacoes.remove(contracao);
	}
	
	public void listarContratacao() {
		if(!contratacoes.isEmpty()) System.out.println("***Contratações***");
		
		for(Projeto projeto : listarProjetos()) {
			System.out.println(projeto.toString());
			listarFuncionarios(projeto);
		}
	}
	
	private List<Projeto> listarProjetos() {
		List<Projeto> projetos = new ArrayList<Projeto>();
		
		for(Contratacao contratacao: contratacoes) {
			if(!projetos.contains(contratacao.getProjeto())) projetos.add(contratacao.getProjeto());
		}
		
		return projetos;
	}
	
	private void listarFuncionarios(Projeto projeto) {
		System.out.println("Funcionario(s): ");
		for(Contratacao contratacao : contratacoes) {
			if(contratacao.getProjeto().equals(projeto) && !contratacao.isDemitido()) {
				System.out.println(contratacao.getFuncionario().toString() + " [Status: " + contratacao.getStatus() + "]");
			}
		}
		System.out.println("\n");
	}
	
	@Override
	public String toString() {
		return "Projeto: ".concat(this.nome);
	}

}
