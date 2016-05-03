/**
 * 
 */
package com.jems.cbd.oracle;

import java.util.List;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.atores.Pessoa;
import com.jems.cbd.atores.dao.PessoaDao;
import com.jems.cbd.input.Entrada;

/**
 * a classe <code>TestesOracle</code> para testes
 * 
 * @author jardel
 * @version 1.0
 */

@Cabecalho(dataCriacao = "21/04/2016")

@SuppressWarnings("unused")
public class TestesOracle {

	
	public static void main(String[] args) {

		ConexaoOracle conexaoOracle = new ConexaoOracle();
		PessoaDao pdo = new PessoaDao();
		Pessoa pessoa = new Pessoa();

		// nova pessoa receber dados manual

		// pessoa = new Entrada().getPessoa();

		// inserir

		// pdo.inserirAtor(pessoa, conexaoOracle.getConnection());

		// selecionar apartir do cpf

		/*
		 * pessoa = pdo.selectAtor("12345678978",
		 * conexaoOracle.getConnection());
		 * System.out.println(pessoa.toString());
		 */

		// listar todos

		/*
		 * List<Pessoa> pessoas =
		 * pdo.listarAtores(conexaoOracle.getConnection()); for (Pessoa p :
		 * pessoas) { System.out.println(p.toString()); }
		 */

		// inserindo muitos com for;

		/*
		 * for(int a=0;a<10;a++){ pessoa= new Pessoa( new Pessoa("maria" + a,
		 * "silva" + a, "maria@gmail.com" + a, "0020050046" + a);
		 * pdo.inserirAtor(pessoa,conexaoOracle.getConnection()); }
		 */

		// deletar

		/*
		 * pessoa.setCpf("00569234589"); pdo.deleteAtor(pessoa,
		 * conexaoOracle.getConnection());
		 */

		// update

		/*
		 * pessoa = new Entrada().getPessoa(); pdo.updateAtor(pessoa,
		 * conexaoOracle.getConnection());
		 */

	}

}
