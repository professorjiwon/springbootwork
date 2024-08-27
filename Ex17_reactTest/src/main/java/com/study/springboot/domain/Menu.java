package com.study.springboot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Menu {
	@Id
	@SequenceGenerator (
			name="myMenuSEQ",
			sequenceName = "MENU_SEQ",
			allocationSize = 1
			)	
	@GeneratedValue(generator="myMenuSEQ")
	private Long id;
	private String restaurant;	// 음식점 이름
	private String name;		// 메뉴명
	private Long price;
	
	@Enumerated(EnumType.STRING)
	private Type type;		// 한식 KR / 중식 CH / 일식 JP
	
	@Enumerated(EnumType.STRING)
	private Taste taste;	// 순한맛 MILD / 매운맛 HOT
}