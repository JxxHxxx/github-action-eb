package com.jxx.githubactioneb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellController {

    @GetMapping
    public String Hello() {

        return "hello";
    }
}
