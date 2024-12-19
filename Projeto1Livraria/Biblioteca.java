package Projeto1Livraria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros = new ArrayList<>();
	private List<Autor> autores = new ArrayList<>();
	private List<Emprestimo> emprestimos = new ArrayList<>();
	
	public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void realizarEmprestimo(int livroId, String nomeUsuario) {
        for (Livro livro : livros) {
            if (livro.getId() == livroId && livro.isDisponivel()) {
                livro.setDisponivel(false);
                livro.atualizarData();
                emprestimos.add(new Emprestimo(livro, nomeUsuario, new Date()));
                System.out.println("O livro '" + livro.getTitulo() + "' foi emprestado com sucesso para " + nomeUsuario + ".");
                return;
            }
        }
        System.out.println("Livro não disponível ou não encontrado.");
    }
}
