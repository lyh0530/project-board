package com.koreait.projectboard.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Index;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "title"),
        @Index(columnList = "hashtag"),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy")
})
public class Article {
    private Long id;
    private String title;
    private String content;
    private String hashtag;


    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
