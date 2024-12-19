package Projeto1Livraria;

import java.util.Date;

public class Emprestimo {

	
	 private Livro livro;
	    private String nomeUsuario;
	    private Date dataEmprestimo;

	    public Emprestimo(Livro livro, String nomeUsuario, Date dataEmprestimo) {
	        this.livro = livro;
	        this.nomeUsuario = nomeUsuario;
	        this.dataEmprestimo = dataEmprestimo;
	    }

	    public Livro getLivro() {
	        return livro;
	    }

	    public String getNomeUsuario() {
	        return nomeUsuario;
	    }

	    public Date getDataEmprestimo() {
	        return dataEmprestimo;
	    }

	    @Override
	    public String toString() {
	        return "Emprestimo [livro=" + livro.getTitulo() + ", nomeUsuario=" + nomeUsuario + ", dataEmprestimo=" + dataEmprestimo + "]";
	    }
}
