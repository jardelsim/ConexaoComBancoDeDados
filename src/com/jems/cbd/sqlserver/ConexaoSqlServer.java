/**
 * 
 */
package com.jems.cbd.sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.padrois.CriarConexao;

/**
 * A classe <code>ConexaoSqlServer</code> contem o metodo getConnection() que é
 * uma fabrica de conexao <i> Sql Server </i> que recebe a cadeia de conexao com
 * "jdbc:sqlserver://localhost:1433;databaseName=banco;user=sa;password=0000"
 * ex: acima banco local usuario padrao sa e a senha é criada no momento da
 * instalaçao.
 * 
 * @author jardel Cavalcante
 * @version 1.0
 */

@Cabecalho(dataCriacao = "21/04/2016")

public class ConexaoSqlServer implements CriarConexao {

	@Override
	public Connection getConnection() {
		try {
			return DriverManager
					.getConnection("jdbc:sqlserver://192.168.1.102:1433;databaseName=teca;user=sa;password=1234");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
