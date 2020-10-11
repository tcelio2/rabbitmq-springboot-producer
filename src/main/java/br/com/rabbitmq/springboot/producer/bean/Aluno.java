package br.com.rabbitmq.springboot.producer.bean;

public class Aluno {

	
	private String nome;
	private int idade;
	private String serie;
	
	
	
	public Aluno() {
	}

	public Aluno(String nome, int idade, String serie) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.serie = serie;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	
	
}
