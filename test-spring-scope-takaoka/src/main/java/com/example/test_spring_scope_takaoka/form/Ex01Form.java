package com.example.test_spring_scope_takaoka.form;

public class Ex01Form {
    /** メールアドレス */
    private String email;
    /** パスワード */
    private String password;

    @Override
    public String toString() {
        return "ex01Form [email=" + email + ", password=" + password + "]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
