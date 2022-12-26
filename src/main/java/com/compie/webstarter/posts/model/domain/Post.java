package com.compie.webstarter.posts.model.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private String content;
    private String test;




    @OneToMany(targetEntity = Comment.class, cascade = CascadeType.ALL)
    @JoinColumn(name="post_id", referencedColumnName = "id")
    @ToString.Exclude
    private List<Comment> comments;

}
