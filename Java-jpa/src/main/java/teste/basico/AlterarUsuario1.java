package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Java-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("silva");
		usuario.setEmail("silva@gmail.com");

		em.merge(usuario);
		
		System.out.println(usuario.getEmail());
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
