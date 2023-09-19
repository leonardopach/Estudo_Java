package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "João da silva");
		dao.incluir(sql, "Pedro gabriel");
		dao.incluir(sql, "Rodrigo do santos");
		
		dao.close();
	}
}
