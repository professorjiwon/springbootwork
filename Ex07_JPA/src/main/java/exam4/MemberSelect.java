package exam4;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MemberSelect {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			Member4 user = em.find(Member4.class, "mem@tjoeun.com");
			
			if(user != null) {
				System.out.println("이름 : " + user.getName());
				System.out.println("가입한 날짜 : " + user.getCreateDate());
			} else {
				System.out.println("존재하지 않습니다");
			}
			
			em.getTransaction().commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		em.close();
		emf.close();
	}

}
