package com.compie.webstarter.posts.service;

import com.compie.webstarter.posts.model.domain.Post;
import com.compie.webstarter.posts.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<Post> getPost() {
        log.info("getting post");
        return postRepository.findAll();
    }

    @Override
    public Post createNew(Post user) {
        log.info("creating new user");
        return postRepository.save(user);
    }
}
