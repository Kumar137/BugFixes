package com.upgrad.ImageHoster.controller;

import com.upgrad.ImageHoster.model.Image;
import com.upgrad.ImageHoster.service.ImageService;
import com.upgrad.ImageHoster.service.TagService;
import com.upgrad.ImageHoster.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
public class CommentController {

    @Autowired
    private ImageService imageService;

    @Autowired
    private TagService tagService;

    @Autowired
    private UserService userService;

    @RequestMapping("/${title}/comments/create")
    public String showImage1() {


        return "redirect:/";
    }

    @RequestMapping(value="/{title}/comments/create" ,method= RequestMethod.POST)
    public String showImage(@PathVariable int id,
                            @RequestParam("title") String text,
                            Model model) {


        return "redirect:/";
    }
}
