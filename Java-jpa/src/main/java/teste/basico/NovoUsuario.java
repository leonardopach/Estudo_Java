package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Java-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Pedro", "pedro@gmail.com");
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
