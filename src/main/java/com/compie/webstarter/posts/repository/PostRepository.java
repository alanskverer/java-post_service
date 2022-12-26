package com.compie.webstarter.posts.repository;

import com.compie.webstarter.posts.model.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

    List<Post> findAll();
    Post save(Post post);
}