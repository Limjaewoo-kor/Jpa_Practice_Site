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
    private String inputDate;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author, String inputDate){
        this.title = title;
        this.content = content;
        this.author = author;
        this.inputDate= inputDate;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .inputDate(inputDate)
                .build();
    }
}
