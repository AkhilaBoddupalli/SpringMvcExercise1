package com.stackroute.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController
{
    @RequestMapping("/")
    public String display(Model model)
    {
        User user = new User();
        user.setName("akhila");
        user.setAge(22);
        String name=user.getName();
        int age=user.getAge();
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "index";
    }


}



