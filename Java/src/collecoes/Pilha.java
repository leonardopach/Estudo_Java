package collecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.push("Livro 1");
        livros.push("Livro 2");
        livros.push("Livro 3");
        livros.push("Livro 4");
        livros.push("Livro 5");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());

        for(String livro: livros) {
            System.out.println(livro);
        }
    }
}
