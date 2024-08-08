package exam4;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MemberInsert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			Member4 user = new Member4("mem@tjoeun.com", "이고잉", LocalDate.now());
			System.out.println("sql문 출력 : ");
			
			em.persist(user);
			System.out.println("영속 컨텍스트에 반영 : ");
			
			em.getTransaction().commit();
			System.out.println("실제 DB에 반영 : ");
			System.out.println("가입 완료");
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
		emf.close();
	}
}
