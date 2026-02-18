package com.example.test_spring_thymeleaf_takaoka.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.test_spring_thymeleaf_takaoka.domain.Member;
import com.example.test_spring_thymeleaf_takaoka.form.MemberForm;

@Controller
@RequestMapping("/exam")
public class ExamThymeleafController {
    @ModelAttribute
    public MemberForm setUpForm() {
        return new MemberForm();
    }

    @RequestMapping("")
    public String index(Model model) {
        Map<Integer, String> hobbyMap = new LinkedHashMap<>();
        hobbyMap.put(1, "スイム");
        hobbyMap.put(2, "バイク");
        hobbyMap.put(3, "ラン");

        model.addAttribute("hobbyMap", hobbyMap);
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/result")
    public String result(MemberForm form, Model model,RedirectAttributes redirectAttributes) {
        Member member = new Member();
        BeanUtils.copyProperties(form, member);

        List<String> hobbyList = new ArrayList<>();

        for (Integer hobbyCode : form.getHobbyList()) {
            switch (hobbyCode) {
                case 1:
                    hobbyList.add("スイム");
                    break;
                case 2:
                    hobbyList.add("バイク");
                    break;
                case 3:
                    hobbyList.add("ラン");
                    break;
                default:
                    break;
            }
        }
        member.setHobbyList(hobbyList);

        model.addAttribute("member", member);

        return "redirect:/exam/toPage";
    }

    @RequestMapping("/toPage")
    public String toPage() {
        return "ex-thymeleaf-output";

    }
}
