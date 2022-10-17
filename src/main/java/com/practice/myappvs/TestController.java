package com.practice.myappvs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    static List<String> ourList = new ArrayList<>(Arrays.asList("faiz","erum","azka","aksa"));

   
    @GetMapping("/")   
    public String home() {
        
        return "home";
    }

    @GetMapping("/content")   
    public String content() {
        
        return "content";
    }

   
}
