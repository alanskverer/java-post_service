package com.compie.webstarter.posts.model.dto;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class PostRequestDto {
    public String name;
    public String password;
}
