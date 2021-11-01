package com.Mmmo.web.dto;

import com.Mmmo.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;
    private String inputDate;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.inputDate = entity.getInputDate();
    }
}
