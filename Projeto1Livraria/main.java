package Projeto1Livraria;

import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor(1, "Machado de Assis", new Date());
        Autor autor2 = new Autor(2, "Clarice Lispector", new Date());
        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);

        biblioteca.adicionarLivro(new Livro(1, "Dom Casmurro", autor1));
        biblioteca.adicionarLivro(new Livro(2, "A Hora da Estrela", autor2));

        while (true) {
            System.out.println("Deseja ver os livros disponíveis? (sim/não)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("não")) {
                System.out.println("Fim da aplicação.");
                break;
            }

            if (resposta.equalsIgnoreCase("sim")) {
                biblioteca.listarLivrosDisponiveis();

                System.out.println("Informe o ID do livro que deseja emprestar:");
                int livroId = Integer.parseInt(scanner.nextLine());

                System.out.println("Informe seu nome:");
                String nomeUsuario = scanner.nextLine();

                biblioteca.realizarEmprestimo(livroId, nomeUsuario);
            } else {
                System.out.println("Resposta inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

}


