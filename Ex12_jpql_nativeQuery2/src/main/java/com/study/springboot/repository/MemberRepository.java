package com.study.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.study.springboot.domain.Member;

/*
* JPQL(Java Persistence Query Language)
	: JPA의  query Method만으로는 조회가 불가능한 경우
	  JPQL을 이용하여 SQL과 비슷한 형태의 쿼리를 작성하여 조회

* nativeQuery
 	: SQL문을 직접 정의하여 사용하는 방식
*/

@Repository					
public interface MemberRepository extends JpaRepository<Member, Long>{
	// JPQL 쿼리 : from뒤에는 영속성에 있는 엔티티명(DB테이블이 아님. 영속성 테이블명은 반드시 대문자로)
	
				// 테이블의 별칭 m으로 설정함. Param으로 값이 넘어오고 그게 search에 들어감
	@Query("select m from JPAPAGING m where m.name like :name order by m.name desc")
	List<Member> findByNameLike(@Param("name") String search);

	
	
	
	
}
