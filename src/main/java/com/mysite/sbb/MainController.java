package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/start")
    @ResponseBody
    public String index() {
        return "프로젝트 시작.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}