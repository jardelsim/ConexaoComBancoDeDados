/**
 * 
 */
package com.jems.cbd.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.padrois.CriarConexao;

/**
 * A classe <code>ConexaoOracle</code> contem o metodo getConnection() que é uma
 * fabrica de conexao <i> Oracle </i> que recebe a cadeia de conexao com
 * "jdbc:oracle:thin:@localhost:1521:XE", "user", "0000" ex: acima banco local
 * usuario deve ser criado bem como senha, usuario padrao sys e system a senha é
 * criada no momento da instalaçao
 * 
 * @author jardel Cavalcante
 * @version 1.0
 */

@Cabecalho(dataCriacao = "21/04/2016")

public class ConexaoOracle implements CriarConexao {

	@Override
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "root", "1234");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
