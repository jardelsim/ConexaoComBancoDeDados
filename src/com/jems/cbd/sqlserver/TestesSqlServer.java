/**
 * 
 */
package com.jems.cbd.sqlserver;

import java.util.List;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.atores.Pessoa;
import com.jems.cbd.atores.dao.PessoaDao;
import com.jems.cbd.input.Entrada;
import com.jems.cbd.postgri.ConexaoPostgri;

/**
 * a classe <code>TestesSqlServer</code> para testes
 * 
 * @author jardel
 * @version 1.0
 */

@Cabecalho(dataCriacao = "21/04/2016")

@SuppressWarnings("unused")
public class TestesSqlServer {

	
	public static void main(String[] args) {
		ConexaoSqlServer conexaoSqlServer = new ConexaoSqlServer();
		PessoaDao pdo = new PessoaDao();
		Pessoa pessoa = new Pessoa();

		// nova pessoa receber dados manual

		// pessoa = new Entrada().getPessoa();

		// inserir

		// pdo.inserirAtor(pessoa, conexaoSqlServer.getConnection());

		// selecionar apartir do cpf

		/*
		 * pessoa = pdo.selectAtor("12345678978",
		 * conexaoSqlServer.getConnection());
		 * System.out.println(pessoa.toString());
		 */

		// listar todos

		/*
		 * List<Pessoa> pessoas =
		 * pdo.listarAtores(conexaoSqlServer.getConnection()); for (Pessoa p :
		 * pessoas) { System.out.println(p.toString()); }
		 */

		// inserindo muitos com for;

		/*
		 * for (int a = 0; a < 10; a++) { pessoa = new Pessoa("maria" + a,
		 * "silva" + a, "maria@gmail.com" + a, "002005004" + a);
		 * pdo.inserirAtor(pessoa, conexaoSqlServer.getConnection()); }
		 */
		// deletar

		/*
		 * pessoa.setCpf("00569234589"); pdo.deleteAtor(pessoa,
		 * conexaoSqlServer.getConnection());
		 */

		// update

		/*
		 * pessoa = new Entrada().getPessoa(); pdo.updateAtor(pessoa,
		 * conexaoSqlServer.getConnection());
		 */

	}

}
