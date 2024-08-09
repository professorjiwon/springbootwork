package com.study.springboot.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
// @CreatedDate와 @LastModifiedDate를 사용할 때 반드시 추가
// Ex10AsscosiativeMappingApplication클래스에 @EnableJpaAuditing어노테이션 반드시 추가
@EntityListeners(AuditingEntityListener.class)
@Entity(name="member03")
public class Member {
	@Id
	private String id;
	private String name;
	private String password;
	
	// 엔티티의 생성될때 날짜와시간 저장
	@CreatedDate
	@Column(name="create_at")
	private LocalDateTime createAt;
	
	@LastModifiedDate  	// 엔티티가 수정될 때 날짜와 시간 저장
	@Column(name="update_at")
	private LocalDateTime updateAt;
}