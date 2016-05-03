package com.jems.cbd.padrois;

import java.sql.Connection;

import com.jems.cbd.anotations.Cabecalho;

/**
 * A interface <code>CriarConexao</code> toda facrica de coneçao deve
 * implementar
 * 
 * 
 * @author jardel Cavalcante
 * @version 1.0
 */
@Cabecalho(dataCriacao = "01/05/2016")

public interface CriarConexao {
	Connection getConnection();
}
