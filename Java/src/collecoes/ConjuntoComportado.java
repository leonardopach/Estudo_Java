package collecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> lista = new TreeSet<String>();
        
        lista.add("Ana");
        lista.add("Maria");
        lista.add("João");
        lista.add("Pedro");
        
        for(String candidato: lista) {
            System.out.print(candidato + " ");
        }
        System.out.println();
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for(int num: nums) {
            System.out.print(num + " ");
        }
    }
}
