/**
 * 
 */
package com.jems.cbd.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.padrois.CriarConexao;

/**
 * A classe <code>ConexaoMysql</code> contem o metodo getConnection() que é uma
 * fabrica de conexao <i>Mysql </i> que recebe a cadeia de conexao
 * "jdbc:mysql://localhost:3306/banco", "root", "" ex: acima banco local usuario
 * padrao root e senha nula, no ex: usei o banco que vem no easyphp por isto a
 * senha é nula e deve ser modificada.
 * 
 * @author jardel Cavalcante
 * @version 1.0
 */

@Cabecalho(dataCriacao = "21/04/2016")

public class ConexaoMysql implements CriarConexao {

	@Override
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://192.168.1.102:3306/teca", "jardel", "1234");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
