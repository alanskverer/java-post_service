package com.compie.webstarter.posts.service;

import com.compie.webstarter.posts.model.domain.Post;

import java.util.List;

public interface PostService {
    List<Post> getPost();

   Post createNew(Post post);
}
