package com.springboot.blog.service;

import com.springboot.blog.dto.CommentDto;
import com.springboot.blog.exception.ResourceNotFoundException;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto) throws ResourceNotFoundException;
    List<CommentDto> getCommentsByPostId(long postId);
    CommentDto getCommentsById(long postId ,long commentId) throws ResourceNotFoundException;
    CommentDto updateComment(long postId, long commentId, CommentDto commentRequest) throws ResourceNotFoundException;
    void deleteComment(long postId, long commentId) throws ResourceNotFoundException;
}
