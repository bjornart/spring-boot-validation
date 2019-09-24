package com.example.springbootvalidation.controller;

import com.example.springbootvalidation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

    @Controller
    public class UserController {

        @RequestMapping("add")
        public String toAdd(User user) {
            return "add";
        }

        @RequestMapping("addUser")
        public String add(@Valid User user, BindingResult result) {
            System.out.println(result);
            if (result.hasErrors()) {
                return "add";
            }
            System.out.println("Saved user " + user.getName());
            return "success";
        }
    }

