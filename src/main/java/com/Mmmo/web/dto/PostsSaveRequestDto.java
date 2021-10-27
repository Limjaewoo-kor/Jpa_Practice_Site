package com.Mmmo.web.dto;

import com.Mmmo.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    private String dateTime;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author, String dateTime){
        this.title = title;
        this.content = content;
        this.author = author;
        this.dateTime= dateTime;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .dateTime(dateTime)
                .build();
    }
}
