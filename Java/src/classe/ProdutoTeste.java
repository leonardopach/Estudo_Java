package classe;


public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");

        p1.preco = 4356.89;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        Produto.desconto = 0.50;

        System.out.println(p1.nome);
        System.out.println(p1.preco);

        System.out.println(p2.nome);
        System.out.println(p2.preco);

        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());
        System.out.println(p1.precoComDesconto(0.23));

    }
}
