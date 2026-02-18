package com.example.test_spring_thymeleaf_takaoka.form;

import java.util.List;

public class MemberForm {
    private String name;
    private Integer age;
    private List<Integer> hobbyList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Integer> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }

}
