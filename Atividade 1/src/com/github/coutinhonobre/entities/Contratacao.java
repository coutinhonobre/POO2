package com.github.coutinhonobre.entities;

import java.util.Date;
import com.github.coutinhonobre.entities.enums.Cargo;
import com.github.coutinhonobre.entities.enums.Status;

public class Contratacao {
	
	private Projeto projeto;
	private Funcionario funcionario;
	private Date data;
	private Cargo cargo;
	private Status status = Status.PENDENTE;
	
	public Contratacao(Projeto projeto, Funcionario funcionario, Date data, Cargo cargo) {
		this.projeto = projeto;
		this.funcionario = funcionario;
		this.data = data;
		this.cargo = cargo;
	}
	
	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		this.status = Status.CONTRATADO;
	}
	
	public void demitir() {
		this.status = Status.DEMITIDO;
	}

}
