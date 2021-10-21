package com.Mmmo.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter  //getter메소드 자동 생성
@NoArgsConstructor // 기본 생성자 자동추가
@Entity //테이블과 링크될 클래스
public class Posts {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK생성규칙
    private Long id;

    //테이블의 컬럼명[길이변경가능]
    @Column(length = 500, nullable = false)
    private String title;

    //테이블의 컬럼명[타입변경가능]
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //생성자상단에 선언시 생성자에 포합된 필드만 빌더에 포
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
