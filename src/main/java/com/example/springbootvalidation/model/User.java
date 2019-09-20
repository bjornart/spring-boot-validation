package com.example.springbootvalidation.model;
import javax.validation.constraints.NotBlank;


public class User {
    @NotBlank(message = "username cannot be empty")
    private String name;
    @NotBlank(message = "password cannot be empty")
    private String password;
    private Double grade;

    public User(String name, String password, Double grade) {
        this.name = name;
        this.password = password;
        this.grade = grade;
    }
}
