package com.marom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by maro on 10/03/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "test";
    }
}

