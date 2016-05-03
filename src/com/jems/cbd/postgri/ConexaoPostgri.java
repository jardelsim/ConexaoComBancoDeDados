/**
 * 
 */
package com.jems.cbd.postgri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.padrois.CriarConexao;

/**
 * A classe <code>ConexaoPostgri</code> contem o metodo getConnection() que é
 * uma fabrica de conexao <i> Postgri</i> que recebe a cadeia de conexao com
 * ("jdbc:postgresql://localhost:5432/postgres", "postgres", "0000") ex: acima
 * banco local usuario padrao postgres a senha é criada no momento da
 * instalaçao.
 * 
 * @author jardel Cavalcante
 * @version 1.0
 */

@Cabecalho(dataCriacao = "21/04/2016")
public class ConexaoPostgri implements CriarConexao {

	@Override
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
