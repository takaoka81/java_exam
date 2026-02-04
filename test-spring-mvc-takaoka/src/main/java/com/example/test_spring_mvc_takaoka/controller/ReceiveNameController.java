package com.example.test_spring_mvc_takaoka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_takaoka.form.ReceiveNameForm;

@Controller
@RequestMapping("/exam03")
public class ReceiveNameController {
    @ModelAttribute
    public ReceiveNameForm form(){
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String nameForm(){
        return "name-form";
    }

    @RequestMapping("/receive-name")
    public String receivename(String name){
        System.out.println("入力された値は" + name + "です");
        return "finished";
    }

    @RequestMapping("/recive-form")
    public String receiveForm(ReceiveNameForm form){
        System.out.println("入力された値は" + form.getName() + "です");
        return "finished";
    }
}
