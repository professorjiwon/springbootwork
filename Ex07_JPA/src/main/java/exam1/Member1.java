package exam1;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/*
 * @Entity : 해당 클래스가 JPA의 엔티티임을 의미(테이블과 매핑되는 JPA)
 * @Id : 식별자 - primary key
 * @GeneratedValue : 자동 생성 sequence
 * @Column : 테이블과 매핑될 컬럼명 지정. 이 어노테이션이 없으면 필드명==컬럼명
 */
@Entity
@Table(name="JpaMember1")
public class Member1 {
	@Id
	@GeneratedValue
	private Long id;  // 기본자료형은 별도의 초기과정이 없으면 0으로 초기화
					  // wrapper클래스는 초기값은 NULL 그러므로 NULL이면 id가 없다라는 것을 보장
	private String username;
	
	@Column(name="create_date")
	private LocalDate createDate;

	public Member1() {
	}
	
	public Member1(String username, LocalDate createDate) {
		this.username = username;
		this.createDate = createDate;
	}
}
