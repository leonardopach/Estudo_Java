package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();

        c1.cliente = "Leonardo";
        c1.itens.add(new Item("Camiseta", 2,  10));
        c1.itens.add(new Item("Borracha", 3,  3.4));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());
    }
}
