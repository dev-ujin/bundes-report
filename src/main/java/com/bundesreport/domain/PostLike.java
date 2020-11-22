package com.bundesreport.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Where;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Setter
@Where(clause = "deleted = false")
@Table(name = "post_likes")
public class PostLike {

	@Id
	@GeneratedValue
	private Long id;

	private boolean deleted;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;

	@CreationTimestamp
	private LocalDateTime createdDate;

	@Builder
	public PostLike(Long id, User user, Post post) {
		this.id = id;
		this.user = user;
		this.post = post;
	}
}