package com.example.test_spring_scope_takaoka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class Ex02Controller {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index(){
        return "exam02";
    }

    @RequestMapping("/result")
    public String add(int num1, int num2){
        int addResult = num1 + num2;

        session.setAttribute("result", addResult);

        return "exam02-result";
    }

    @RequestMapping("/topage")
    public String topage(){
        return "exam02-result2";
    }
}
