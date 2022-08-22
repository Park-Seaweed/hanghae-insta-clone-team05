package com.project.instagramcloneteam5.model.dto;

import com.project.instagramcloneteam5.model.Board;
import lombok.Getter;

import java.util.List;
@Getter
public class BoardDetailsResponseDto {
    private Long boardId;
    private String username;
    private String content;

    private List<String> imgUrl;

    private List<CommentResponseDto> commentList;
    private List<CommitResponseDto> commitList;


    public BoardDetailsResponseDto(Long boardId, Board board, List<String> imgUrl, List<CommentResponseDto> commentList, List<CommitResponseDto> commitList) {
        this.boardId = boardId;
        this.username = board.getMember().getUsername();
        this.content = board.getContent();
        this.imgUrl = imgUrl;
        this.commentList =commentList;
    }
}
