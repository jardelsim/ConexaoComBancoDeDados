/**
 * 
 */
package com.jems.cbd.mysql;

import java.util.List;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.atores.Pessoa;
import com.jems.cbd.atores.dao.PessoaDao;
import com.jems.cbd.input.Entrada;
import com.jems.cbd.sqlserver.ConexaoSqlServer;

/**
 * a classe <code>TestesMysql</code> para testes
 * 
 * @author jardel
 * @version 1.0
 */

@Cabecalho(dataCriacao = "21/04/2016")

@SuppressWarnings("unused")
public class TestesMysql {

	
	public static void main(String[] args) {

		ConexaoMysql conexaoMysql = new ConexaoMysql();
		PessoaDao pdo = new PessoaDao();
		Pessoa pessoa = new Pessoa();

		// nova pessoa receber dados manual

		// pessoa = new Entrada().getPessoa();

		// inserir

		// pdo.inserirAtor(pessoa, conexaoMysql.getConnection());

		// selecionar apartir do cpf

		/*
		 * pessoa = pdo.selectAtor("12345678978", conexaoMysql.getConnection());
		 * System.out.println(pessoa.toString());
		 */

		// listar todos

		/*
		 * List<Pessoa> pessoas =
		 * pdo.listarAtores(conexaoMysql.getConnection()); for (Pessoa p :
		 * pessoas) { System.out.println(p.toString()); }
		 */

		// inserindo muitos com for;

		/*
		 * for(int a=0;a<10;a++){ pessoa= new Pessoa("maria" + a, "silva" + a,
		 * "maria@gmail.com" + a, "002005004" + a);
		 * pdo.inserirAtor(pessoa,conexaoMysql.getConnection()); }
		 */

		// deletar

		/*
		 * pessoa.setCpf("00569234589"); pdo.deleteAtor(pessoa,
		 * conexaoMysql.getConnection());
		 */

		// update

		/*
		 * pessoa = new Entrada().getPessoa(); pdo.updateAtor(pessoa,
		 * conexaoMysql.getConnection());
		 */

	}

}
