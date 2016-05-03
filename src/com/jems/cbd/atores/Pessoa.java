/**
 * 
 */
package com.jems.cbd.atores;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.jems.cbd.anotations.Cabecalho;

/**
 * Através da classe <code>Pessoa</code> serão instanciados os <i> objetos
 * Pessoa</i> que serão persistidos no banco de dado através do JDBC e também do
 * Hibernante, possui um construtor vazio e outro com todos os atributos da
 * classe, o toString sobrescrito para imprimir pessoa, e todo os Get e Sets
 * além da Anotations do Hibernate.
 * 
 * 
 * @author jardel Cavalcante
 * @version 1.0
 * @see com.jems.cbd.hibernate.TestesHibernate
 * @see com.jems.cbd.atores.dao.PessoaDao
 * @see com.jems.cbd.padrois.PersistirAtor
 */

@Cabecalho(dataCriacao = "21/04/2016")

/*
 * @Entity É a principal anotação do JPA "Hibernate". Ela deve aparecer antes do
 * nome de uma classe e deve ser definida em todas as classes que terão objetos
 * persistidos no banco de dados
 */
@Entity
public class Pessoa {
	/*
	 * @Id Utilizada para indicar qual atributo de uma classe anotada com
	 * 
	 * @Entity será mapeado para a chave primária da tabela correspondente à
	 * classe
	 */
	@Id
	/*
	 * @GeneratedValue Geralmente vem acompanhado da anotação @Id. Serve para
	 * indicar que o atributo é gerado pelo banco, no momento em que um novo
	 * registro é inserido
	 */
	@GeneratedValue
	private Long id;
	private String nome;
	private String sobreNome;
	private String email;
	private String cpf;

	public Pessoa() {
	}

	public Pessoa(String nome, String sobreNome, String email, String cpf) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " Sobrenome: " + this.sobreNome + " Email: " + this.email + " Cpf: " + this.cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}