package com.chain.taskmaster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticController {

    @GetMapping("/addtask")
    public String getAddTask() {
        return "addtask";
    }

    @GetMapping("/")
    public String getHome() {
        return "home";
    }
}
