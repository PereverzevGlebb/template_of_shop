package com.example.demo.Controllers;

import com.example.demo.Models.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TopController{
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/mainPage")
    public String supportPage(Model model) {

        return "mainPage";
    }
    @GetMapping("/")
    public String Page(Model model) {

        return "mainPage";
    }

}