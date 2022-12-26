package com.compie.webstarter.posts.repository;

import com.compie.webstarter.posts.model.domain.Comment;
import com.compie.webstarter.posts.model.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {

    List<Comment> findAll();
//    Post save(Post post);
}