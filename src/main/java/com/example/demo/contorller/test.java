package com.example.demo.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class test {
    @ResponseBody
    @RequestMapping("index")
    public String aa(){
        return "ok";
    }
}
