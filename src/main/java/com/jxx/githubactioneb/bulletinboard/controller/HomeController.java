package com.jxx.githubactioneb.bulletinboard.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/resource")
    public String home(@ModelAttribute Member member) {
        log.info("member = {}, {}", member.getName(), member.getAge());
        return "home";
    }
}
@Getter
@Setter
class Member {
    private String name;
    private Integer age;

}
