package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	public static void main(String[] args) {

		Produto produto = new Produto("Lapis", 3.72);

		DAO<Produto> dao = new DAO<>(Produto.class);
//		dao.abrirT().incluir(produto).fecharT().fechar();
		dao.incluirAtomico(produto).fechar();
	}
}
