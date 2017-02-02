package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * When the request come, spring will move to template index and render it
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    String watIndex(){
        return "index";
    }

    @RequestMapping("/info")
    String infoIndex(){
        return "info";
    }


}