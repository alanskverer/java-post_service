package com.compie.webstarter.posts.controller;

import com.compie.webstarter.posts.model.dto.PostResponseDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Post Controller")
@RestController
@RequestMapping("/v1/post")
@Validated
public interface PostController {

    @GetMapping
    List<PostResponseDto> get();

//    @PostMapping()
//    PostResponseDto post(@RequestBody PostRequestDto userRequestDto);
}

