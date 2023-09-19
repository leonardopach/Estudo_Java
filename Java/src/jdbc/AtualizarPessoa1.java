package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa1 {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);

		Connection conexao = FabricarConexao.getConexao();
		String sql = "UPDATE pessoas set nome = ? WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		System.out.println("Digite nome: ");
		String valor = entrada.nextLine();
		stmt.setString(1, valor);

		System.out.println("Digite o codigo: ");
		int valor2 = entrada.nextInt();
		stmt.setInt(2, valor2);

		int resultado = stmt.executeUpdate();

		if (resultado > 0) {
			System.out.println("Atualizacao realizada com sucesso.");
		} else {
			System.out.println("Nenhuma linha atualizada. Verifique o código fornecido.");
		}

		entrada.close();
		stmt.close();
		conexao.close();
	}
}
