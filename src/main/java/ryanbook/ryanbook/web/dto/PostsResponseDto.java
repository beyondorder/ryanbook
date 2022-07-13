package ryanbook.ryanbook.web.dto;

import lombok.Getter;
import ryanbook.ryanbook.domain.posts.Posts;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entitiy){
        this.id = entitiy.getId();
        this.title = entitiy.getTitle();
        this.content = entitiy.getContent();
        this.author = entitiy.getAuthor();
    }
}
