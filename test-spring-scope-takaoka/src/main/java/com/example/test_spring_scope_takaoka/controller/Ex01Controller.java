package com.example.test_spring_scope_takaoka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_scope_takaoka.form.Ex01Form;


@Controller
@RequestMapping("/ex01")
public class Ex01Controller {

    @ModelAttribute
    private Ex01Form form() {
        return new Ex01Form();
    }

    @RequestMapping("")
    public String index(){
        return "exam01";
    }

    @RequestMapping("/result")
    public String result(Ex01Form form, Model model){
        if("yamada@sample.com".equals(form.getEmail()) && "yamayama".equals(form.getPassword())){
//            model.addAttributes("result", "成功");
model.addAttribute("result", "成功");
        }else{
            model.addAttribute("result", "失敗");
        }

        return "exam01-result";
    }
    
    
}
