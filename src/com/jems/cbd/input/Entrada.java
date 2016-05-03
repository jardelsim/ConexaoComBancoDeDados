/*
 * 
 */
package com.jems.cbd.input;

import java.util.Scanner;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.atores.Pessoa;

/**
 * A classe <code>Entrada</code> e a interface de entrada de dados do objeto
 * pessoa fornecidaos pelo usuario
 * 
 * @author jardel
 * @version 1.0
 * @see com.jems.cbd.atores.Pessoa
 */

@Cabecalho(dataCriacao = "21/04/2016")

public class Entrada {

	private static Scanner scan;

	public Pessoa getPessoa() {

		Pessoa pessoa = new Pessoa();
		scan = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		pessoa.setNome(scan.next());
		System.out.print("Digite o sobrenome: ");
		pessoa.setSobreNome(scan.next());
		System.out.print("Digite o email: ");
		pessoa.setEmail(scan.next());
		System.out.print("Digite o cpf: ");
		pessoa.setCpf(scan.next());
		scan.close();

		return pessoa;

	}

}
