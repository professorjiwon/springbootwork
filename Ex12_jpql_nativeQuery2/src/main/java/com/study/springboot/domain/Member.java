package com.study.springboot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter					// lombok 게터 생성
@Setter					// lombok 세터 생성
@AllArgsConstructor		// lombok 모든필드생성자 생성
@NoArgsConstructor		// lombok 기본 생성자 생성
@Builder				// lombok 빌더 생성
@Entity(name="jpapaging")
public class Member {
	@Id
	@SequenceGenerator(
			name = "pagingseq",
			sequenceName = "jpapaging_seq",
			initialValue = 1,
			allocationSize = 1
			)
	@GeneratedValue (generator="pagingseq")
	private Long id;
	private String name;
	private String email;
	
	public Member(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
}
