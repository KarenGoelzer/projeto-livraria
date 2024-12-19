package Projeto1Livraria;

import java.util.*;

public class Livro {
	private int id;
	private String titulo;
	private Autor autor;
	private boolean disponivel;
	private Date dataAtualizacao;
	private Date dataCadastro;
	
	public Livro(int id, String titulo, Autor autor) {
		this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.dataCadastro = new Date();
        this.dataAtualizacao = new Date();
	}
	
	public Livro(int id, String titulo, Autor autor, boolean disponivel, Date dataCadastro, Date dataAtualizacao) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = true;
		this.dataCadastro = new Date();
		this.dataAtualizacao = new Date();
	}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void atualizarData() {
        this.dataAtualizacao = new Date();
    }

    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor.getNome() + ", disponivel=" + disponivel + ", dataCadastro=" + dataCadastro + ", dataAtualizacao=" + dataAtualizacao + "]";
    }
	
	
	
	
	
}
