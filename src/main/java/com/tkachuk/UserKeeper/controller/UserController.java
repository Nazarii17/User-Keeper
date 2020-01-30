package com.tkachuk.UserKeeper.controller;

import com.tkachuk.UserKeeper.model.User;
import com.tkachuk.UserKeeper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    @GetMapping("/users")
    public String findAll() {
        List<User> users = userService.findAll();

        return "";
    }

}