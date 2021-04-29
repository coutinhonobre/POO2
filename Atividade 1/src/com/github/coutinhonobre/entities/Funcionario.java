package com.github.coutinhonobre.entities;

import com.github.coutinhonobre.entities.enums.TipoDeDocumento;
public class Funcionario {
	
	private String nome;
	private String numeroDocumento;
	private TipoDeDocumento tipoDeDocumento;
	
	public Funcionario(String nome, String numeroDocumento, TipoDeDocumento tipoDeDocumento) {
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
		this.tipoDeDocumento = tipoDeDocumento;
	}
	
	

}
