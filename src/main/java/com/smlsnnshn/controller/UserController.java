package com.smlsnnshn.controller;

import com.smlsnnshn.dto.UserDTO;
import com.smlsnnshn.entity.User;
import com.smlsnnshn.service.RoleService;
import com.smlsnnshn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user",new UserDTO());
        model.addAttribute("users",userService.findAll());
        model.addAttribute("roleList", roleService.findAll());
        return "/user/create";

    }

}
