package com.github.coutinhonobre.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.github.coutinhonobre.entities.Contratacao;
import com.github.coutinhonobre.entities.Funcionario;
import com.github.coutinhonobre.entities.Projeto;
import com.github.coutinhonobre.entities.enums.Cargo;
import com.github.coutinhonobre.entities.enums.TipoDeDocumento;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Projeto p1 = new Projeto("Contrução da Loja XYZ", dateFormat.parse("01/01/2020"), dateFormat.parse("21/12/2021"));
		Funcionario f1 = new Funcionario("Dory", "999.999.999-00", TipoDeDocumento.CPF);
		Funcionario f2 = new Funcionario("Carline", "111.111.111-00", TipoDeDocumento.CPF);
		Contratacao c1 = new Contratacao(p1, f1, dateFormat.parse("01/01/2020"), Cargo.DIRETOR);
		Contratacao c2 = new Contratacao(p1, f2, dateFormat.parse("11/10/2020"), Cargo.ADMINISTRATIVO);

		
		
		p1.listarContratacao();
		
		c1.contratar();
		p1.listarContratacao();
		
		c1.demitir();
		c2.contratar();
		
		p1.listarContratacao();
		
	
	}

}
