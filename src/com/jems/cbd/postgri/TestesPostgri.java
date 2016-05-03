/**
 * 
 */
package com.jems.cbd.postgri;

import java.util.List;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.atores.Pessoa;
import com.jems.cbd.atores.dao.PessoaDao;
import com.jems.cbd.input.Entrada;
import com.jems.cbd.oracle.ConexaoOracle;

/**
 * a classe <code>TestesPostgri</code> para testes
 * 
 * @author jardel
 * @version 1.0
 */

@Cabecalho(dataCriacao = "21/04/2016")

@SuppressWarnings("unused")
public class TestesPostgri {


	public static void main(String[] args) {
		ConexaoPostgri conexaoPostgri = new ConexaoPostgri();
		PessoaDao pdo = new PessoaDao();
		Pessoa pessoa = new Pessoa();

		// nova pessoa receber dados manual

		// pessoa = new Entrada().getPessoa();

		// inserir

		// pdo.inserirAtor(pessoa, conexaoPostgri.getConnection());

		// selecionar apartir do cpf

		/*
		 * pessoa = pdo.selectAtor("12345678978",
		 * conexaoPostgri.getConnection());
		 * System.out.println(pessoa.toString());
		 */

		// listar todos

		/*
		 * List<Pessoa> pessoas =
		 * pdo.listarAtores(conexaoPostgri.getConnection()); for (Pessoa p :
		 * pessoas) { System.out.println(p.toString()); }
		 */

		// inserindo muitos com for;

		/*
		 * for (int a = 0; a < 10; a++) { pessoa = new Pessoa("maria" + a,
		 * "silva" + a, "maria@gmail.com" + a, "002005004" + a);
		 * pdo.inserirAtor(pessoa, conexaoPostgri.getConnection()); }
		 */

		// deletar

		/*
		 * pessoa.setCpf("00539142360"); pdo.deleteAtor(pessoa,
		 * conexaoPostgri.getConnection());
		 */

		// update

		/*
		 * pessoa = new Entrada().getPessoa(); pdo.updateAtor(pessoa,
		 * conexaoPostgri.getConnection());
		 */
	}

}
