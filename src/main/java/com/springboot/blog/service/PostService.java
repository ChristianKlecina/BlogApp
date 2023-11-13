package com.springboot.blog.service;

import com.springboot.blog.dto.PostDto;
import com.springboot.blog.dto.PostResponse;
import com.springboot.blog.exception.ResourceNotFoundException;

import java.util.List;

public interface PostService{
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id) throws ResourceNotFoundException;
    PostDto updatePost(PostDto postDto, long id) throws  ResourceNotFoundException;
    void deletePost(long id) throws ResourceNotFoundException;

}
