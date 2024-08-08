package exam3;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="JpaMember3")
public class Member3 {
	@Id
	@SequenceGenerator(
			name="mySequence01",
			sequenceName="seq_JpaMem3",
			initialValue=1,		// 초기값
			allocationSize=5	// 증가값
			)
	@GeneratedValue(generator="mySequence01")
	private Long id;
	
	@Access(AccessType.FIELD)  // 기본값: 필드(멤버변수)를 통해 데이터에 접근
	private String username;
	
	@Access(AccessType.PROPERTY)	// get/set메소드를 통해 데이터 접근
	private String password;
	
	@Transient
	private long timestamp1;   // 영속성에서 제외 시키는 방법1. 어노테이션으로
	transient private long timestamp2; // 영속성에서 제외 시키는 방법2. 지시자를 이용하여
	
	public Member3() {
	}

	public Member3(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}










