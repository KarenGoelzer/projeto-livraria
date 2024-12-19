package Projeto1Livraria;

import java.util.Date;

public class Autor {
	private int id;
	private String nome;
	private Date dataNascimento;
	
	public Autor(int id, String nome, Date dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
	
	
	
}
