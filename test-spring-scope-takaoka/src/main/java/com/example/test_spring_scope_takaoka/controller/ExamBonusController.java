package com.example.test_spring_scope_takaoka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_scope_takaoka.domain.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex03")
public class ExamBonusController {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam-bonus-input";
    }

    @RequestMapping("result")
    public String result(String email, String password, Model model) {
        if ("yamada@sample.com".equals(email) && "yamayama".equals(password)) {
            model.addAttribute("result", "ログインに失敗しました");
            return "exam-bonus-input";
        }else{
            User user = new User();
            user.setName("山田太郎");
            user.setEmail("yamada@sample.com");
            user.setAge(18);
            session.setAttribute("user", user);
            return "exam-bouns-result";
        }
    }
}
