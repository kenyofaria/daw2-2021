package br.edu.ifg.entity;

public class Leilao {

	
	private Long id;
	private String nome;
	private String descricao;
	private Situacao situacao;
	
	public Leilao() {
		// TODO Auto-generated constructor stub
	}
	
	public Leilao(Long id, String nome, String descricao, Situacao situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public Leilao(String nome, String descricao, Situacao situacao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
}
