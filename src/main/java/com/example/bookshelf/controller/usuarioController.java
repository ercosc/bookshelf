package com.example.bookshelf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usuarioController {
    
    @RequestMapping("/")
    public String index() {
        return "login";
    }
}
