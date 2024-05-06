package com.example.testcomment.controller;

import com.example.testcomment.entity.Comment;
import com.example.testcomment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentRepository commentRepository;

    @GetMapping("/{content}")
    public List<Comment> getComment(@PathVariable("content") String content) {
        Comment comment = new Comment(content);

        commentRepository.save(comment);
        return commentRepository.findAll();
    }
}
