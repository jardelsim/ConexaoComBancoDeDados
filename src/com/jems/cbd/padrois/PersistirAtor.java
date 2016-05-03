/**
 * 
 */
package com.jems.cbd.padrois;

import java.sql.Connection;
import java.util.List;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.atores.Pessoa;

/**
 * A interface <code>PersistirAtor</code> toda DAO atores deve implementar
 * 
 * 
 * @author jardel Cavalcante
 * @version 1.0
 */
@Cabecalho(dataCriacao = "01/05/2016")

public interface PersistirAtor {

	void inserirAtor(Pessoa pessoa, Connection connection);

	Pessoa selectAtor(String cpf, Connection connection);

	List<Pessoa> listarAtores(Connection connection);

	void deleteAtor(Pessoa pessoa, Connection connection);

	void updateAtor(Pessoa pessoa, Connection connection);

}