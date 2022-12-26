package com.compie.webstarter.posts.model.dto;

import com.compie.webstarter.posts.model.domain.Comment;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class PostResponseDto {
    public String content;
    public List<Comment> comments;

}
