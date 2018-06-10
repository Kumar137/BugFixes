package com.upgrad.ImageHoster.service;

import com.upgrad.ImageHoster.model.Comment;

import java.util.List;

public interface CommentService {

    public List<Comment> getAll();
    public Comment getById(int id);
}
