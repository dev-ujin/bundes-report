package com.bundesreport.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bundesreport.domain.Post;
import com.bundesreport.domain.User;
import com.bundesreport.type.CategoryType;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	public List<Post> findByCategoryOrderByCreatedDateDesc(CategoryType categoryType);

	public List<Post> findTop5ByCategoryOrderByCreatedDateDesc(CategoryType categoryType);

	public List<Post> findByTitleContainsOrContentContainsOrderById(String title, String content);

	public List<Post> findByUser(User user);
}
