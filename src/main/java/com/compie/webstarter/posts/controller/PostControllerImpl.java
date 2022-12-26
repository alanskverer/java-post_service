package com.compie.webstarter.posts.controller;

import com.compie.webstarter.posts.model.domain.Post;
import com.compie.webstarter.posts.model.dto.PostResponseDto;
import com.compie.webstarter.posts.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostControllerImpl implements PostController {

    private final PostService postService;

    @GetMapping
    public List<PostResponseDto> get() {
        log.info("Post log from PostController");
        final List<Post> posts = postService.getPost();
        log.info("getPost response: {}", posts);
        return posts
                .stream()
                .map(post -> PostResponseDto.builder()
                        .content(post.getContent())
                        .comments(post.getComments())
                        .build())
                .collect(Collectors.toList());
    }

//    @Override
//    public PostResponseDto post(PostRequestDto postRequestDto) {
//        Post post = Post.builder()
//                .name(postRequestDto.getName())
//                .email(postRequestDto.getEmail())
//                .password(postRequestDto.password)
//                .build();
//        final Post savedPost = postService.createNew(post);
//        return PostResponseDto.builder()
//                .name(savedPost.getName())
//                .email(savedPost.getEmail())
//                .build();
//    }

//    @Override
//    public ExampleResponseDto post(UserRequestDto postRequestDto) {
//        return null;
//    }

//    @Override
//    @PostMapping()
//    public UserResponseDto post(@Valid @RequestBody final UserRequestDto postRequestDto) {
//        User post = User.builder()
//                .name(postRequestDto.getName())
//                .email(postRequestDto.getEmail())
//                .password(postRequestDto.password)
//                .build();
//        final User savedUser = postService.createNew(post);
//        return UserResponseDto.builder()
//                .name(savedUser.getName())
//                .email(savedUser.getEmail())
//                .build();
//    }
}