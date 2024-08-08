package exam4;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member4 {
	@Id
	private String email;
	private String name;
	@Column(name="create_date")
	private LocalDate createDate;
	
	public Member4() {
	}

	public Member4(String email, String name, LocalDate createDate) {
		this.email = email;
		this.name = name;
		this.createDate = createDate;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	@Override
	public String toString() {
		return "Member4 [email=" + email + ", name=" + name + ", createDate=" + createDate + "]";
	}
	
	public void changeName(String newName) {
		this.name = newName;
	}
}









