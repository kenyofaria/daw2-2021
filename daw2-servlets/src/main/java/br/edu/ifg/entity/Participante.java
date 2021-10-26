package br.edu.ifg.entity;

import java.time.LocalDate;

public class Participante {

	
	private Long id;
	private String cpf;
	private String nome;
	private LocalDate dataNascimento;
	private char sexo;
	
	public Participante(Long id, String cpf, String nome, LocalDate dataNascimento, char sexo) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}

	public Participante(String cpf, String nome, LocalDate dataNascimento, char sexo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}

	public Participante() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
