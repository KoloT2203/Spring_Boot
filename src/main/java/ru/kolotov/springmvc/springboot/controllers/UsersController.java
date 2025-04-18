package ru.kolotov.springmvc.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kolotov.springmvc.springboot.models.User;
import ru.kolotov.springmvc.springboot.service.UserServiceInterface;

@Controller
@RequestMapping("/user")
public class UsersController {

    private final UserServiceInterface userService;

    @Autowired
    public UsersController(UserServiceInterface userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "user/index";
    }

    @GetMapping("/show")
    public String show(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "user/show";
    }

    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user){
        return "user/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {

        userService.createUser(user);
        return "redirect:/user";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam("id") Integer id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "user/edit";
    }

    @PatchMapping("/edit")
    public String update(@ModelAttribute("user") User user, @RequestParam("id") Integer id){

        userService.updateUser(id, user);
        return "redirect:/user";
    }

    @DeleteMapping("/")
    public String delete(@RequestParam("id") Integer id, Model model){
        userService.deleteUserById(id);
        return "redirect:/user";
    }
}
