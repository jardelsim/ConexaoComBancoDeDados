/**
 * 
 */
package com.jems.cbd.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jems.cbd.anotations.Cabecalho;
import com.jems.cbd.atores.Pessoa;
import com.jems.cbd.input.Entrada;

/**
 * a classe <code>TestesHibernate</code> para testes
 * 
 * @author jardel
 * @version 1.0
 */

@Cabecalho(dataCriacao = "21/04/2016")

@SuppressWarnings("unused")
public class TestesHibernate {

	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("teca");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Pessoa pessoa = new Pessoa();

		// inserir

		/*
		 * pessoa = new Entrada().getPessoa(); entityManager.persist(pessoa);
		 */

		// inserir muitos

		/*
		 * for (int a = 0; a < 99; a++) { pessoa = new Pessoa("maria" + a,
		 * "silva" + a, "maria@gmail.com" + a, "00200500465-" + a);
		 * entityManager.persist(pessoa); }
		 */

		// buscar por id

		/*
		 * pessoa = entityManager.find(Pessoa.class, 1L);
		 * System.out.println(pessoa.toString());
		 */

		// deletar

		/*
		 * pessoa = entityManager.find(Pessoa.class, 1L);
		 * entityManager.remove(pessoa);
		 */

		// update

		  /*pessoa = entityManager.find(Pessoa.class, 1l);
		  pessoa.setNome("silva");*/
		 
		// lista todos

		/*
		 * Query query = entityManager.createQuery("SELECT e FROM pessoa");
		 * List<Pessoa> pessoas = query.getResultList(); for (Pessoa p :
		 * pessoas) { System.out.println(p.toString()); }
		 */

		// abri tranzaçao

		entityManager.getTransaction().begin();

		// sincroniza com o banco de dados

		entityManager.getTransaction().commit();

		// fechar conexao

		entityManager.close();
		entityManagerFactory.close();

	}

}
