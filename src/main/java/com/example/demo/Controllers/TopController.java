package com.example.demo.Controllers;

import com.example.demo.Models.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

class TopController {

    @Autowired
    private PostRepository postRepository;
    @PostMapping(path="/add")
    public  String mainPage (Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts",posts);
        return "mainPage";

    }
}