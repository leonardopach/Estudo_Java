package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricarConexao {

    public static Connection getConexao() {
	try {
	    final String url = "jdbc:mysql://localhost/java_estudo?verifyServerCertificate=false&useSSL=true";
	    final String usuario = "root";
	    final String senha = "senha123";

	    return DriverManager.getConnection(url, usuario, senha);
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
}
