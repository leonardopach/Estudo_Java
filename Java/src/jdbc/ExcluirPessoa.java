package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);

		Connection conexao = FabricarConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";

		System.out.println("Digite o Id para deletar");
		int valor = entrada.nextInt();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, valor);
		int resultado = stmt.executeUpdate();

		if(resultado > 0) {
			System.out.println("Pessoa alterada com sucesso");
		} else {
			System.out.println("Nada feito!!");
		}
		entrada.close();
		stmt.close();
		conexao.close();
	}
}
