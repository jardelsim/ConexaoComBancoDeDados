/**
 * 
 */
package com.jems.cbd.atores.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.atores.Pessoa;
import com.jems.cbd.padrois.PersistirAtor;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * A classe <code>PessoaDao</code> e a interface de manipulação dos objetos
 * pessoa com os bancos de dados, ela implementa PersistirAtor e sobrescreve
 * todos os seus métodos, possui parâmetros como Pessoa, cpf e uma Connection do
 * banco de dados escolhido, os sql genéricos contidos nela funcionaram em todos
 * os banco de dados testados desde que a conexão seja feita diretamente no
 * banco ou esquema a ser manipulado ex: no mysql a conexão é feita no
 * esquema/schema/banco "teca" se fosse sem esse atributo o sql de select teria
 * que ser assim "select * from teca.pessoa"
 * 
 * @author jardel Cavalcante
 * @version 1.0
 * @see com.jems.cbd.atores.Pessoa
 * @see com.jems.cbd.mysql.TestesMysql
 * @see com.jems.cbd.mysql.ConexaoMysql
 * @see com.jems.cbd.oracle.TestesOracle
 * @see com.jems.cbd.oracle.ConexaoOracle
 * @see com.jems.cbd.postgri.TestesPostgri
 * @see com.jems.cbd.postgri.ConexaoPostgri
 * @see com.jems.cbd.sqlserver.TestesSqlServer
 * @see com.jems.cbd.sqlserver.ConexaoSqlServer
 * @see com.jems.cbd.padrois.PersistirAtor
 */

@Cabecalho(dataCriacao = "21/04/2016")

public class PessoaDao implements PersistirAtor {

	// parametros uma pessoa e uma conexao, os dado sao salvos no db
	@Override
	public void inserirAtor(Pessoa pessoa, Connection connection) {
		String inserir = "insert into pessoa (nome,sobrenome,email,cpf) values(?,?,?,?)";
		try (PreparedStatement pstm = connection.prepareStatement(inserir)) {
			pstm.setString(1, pessoa.getNome());
			pstm.setString(2, pessoa.getSobreNome());
			pstm.setString(3, pessoa.getEmail());
			pstm.setString(4, pessoa.getCpf());
			pstm.addBatch();
			pstm.executeBatch();
			System.out.println(pessoa.getNome() + " salvo data base");
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	// parametros um cpf e uma conexao, o db processa a informaçao e retorna a
	// pessoa
	@Override
	public Pessoa selectAtor(String cpf, Connection connection) {
		Pessoa pessoa = null;
		String select = "select * from pessoa where cpf='" + cpf + "'";
		try (PreparedStatement stmt = connection.prepareStatement(select); ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				pessoa = new Pessoa(rs.getString("nome"), rs.getString("sobrenome"), rs.getString("email"),
						rs.getString("cpf"));
				System.out.println(pessoa.getNome() + " encontrado");
			}
		} catch (SQLException ex) {
			System.out.println(ex);
		}
		return pessoa;
	}

	// parametros uma conexao, o bd processa a informaçao e retorna uma lista
	// com todas as pessoas da tabela
	@Override
	public List<Pessoa> listarAtores(Connection connection) {
		List<Pessoa> pessoas = new ArrayList<>();
		String select = "select pessoa.nome, pessoa.sobrenome, pessoa.email, pessoa.cpf from pessoa ";
		try (PreparedStatement stmt = connection.prepareStatement(select); ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				pessoas.add(new Pessoa(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException ex) {
			System.out.println(ex);
		}

		return pessoas;
	}

	// parametros uma pessoa e uma conexao, o bd processa a informaçao e deleta
	// a pessoa passada como parametro
	@Override
	public void deleteAtor(Pessoa pessoa, Connection connection) {
		String delete = "delete from pessoa where cpf='" + pessoa.getCpf() + "'";
		try (PreparedStatement stmt = connection.prepareStatement(delete)) {
			stmt.executeUpdate();
			System.out.println("deletado!");
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

	// parametros uma pessoa e uma conexao, o bd processa a informaçao e
	// atualiza os dados da pessoa passada como parametro
	@Override
	public void updateAtor(Pessoa pessoa, Connection connection) {
		String update = "update pessoa set nome=?, sobrenome=?, email=?, cpf=?  where cpf='" + pessoa.getCpf() + "'";
		try (PreparedStatement pstm = connection.prepareStatement(update)) {
			pstm.setString(1, pessoa.getNome());
			pstm.setString(2, pessoa.getSobreNome());
			pstm.setString(3, pessoa.getEmail());
			pstm.setString(4, pessoa.getCpf());
			pstm.executeUpdate();
			System.out.println(pessoa.getNome() + " dados alterados");
		} catch (SQLException ex) {
			System.out.println(ex);
		}

	}
}
