package br.edu.up.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "clientes")
@TableGenerator(
		name = "gerador_de_id",
		table = "sqlite_sequence",
		pkColumnName = "name",
		valueColumnName = "seq",
		pkColumnValue = "clientes",
		initialValue = 1,
		allocationSize = 1
		
	)

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="gerador_de_id")
	
	private int id;
	private String cpf;
	private String nome;
	private String sobrenome;
	private String data;
	private String email;
	
	
	public Cliente() {
		
	}
	
	
	public Cliente(String nome, String sobrenome, String cpf, String data, String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.data = data;
		this.email = email;
	}

	
	public Cliente(int id, String nome, String sobrenome, String cpf, String data, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.data = data;
		this.email = email;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return String.format("\t %-6s %-7s %-27s %-22s %-20s %-8s", id, nome, sobrenome, cpf, data, email);

	}
	
}
