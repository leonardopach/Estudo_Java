package collecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
     
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        List<String> nome = Arrays.asList("Pedro", "Lucas", "Gabriel");

        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("João"));
        lista.add(new Usuario("Ana"));

        System.out.println(lista.get(0));
        System.out.println(nome);

        System.out.println(">>>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Ana")));
        for(Usuario u: lista) {
            System.out.println(u);
        }
    }
}
