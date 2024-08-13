package com.study.springboot.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity(name="board2")
@EntityListeners(AuditingEntityListener.class)
public class Board {
	@Id
	@SequenceGenerator (
			name = "boardseq",
			sequenceName = "board2_seq",
			allocationSize = 1
			)
	@GeneratedValue(generator="boardseq")
	private Long bno;
	@NonNull
	private String title;
	@NonNull
	private String content;
	@NonNull
	private String writer;
	@Column(insertable=false, columnDefinition="NUMBER DEFAULT 0")
	private Long count;
	
	@CreatedDate
	@Column(name="create_date")
	private LocalDateTime createDate;
	
	@LastModifiedDate
	@Column(name="update_date")
	private LocalDateTime updateDate;
}