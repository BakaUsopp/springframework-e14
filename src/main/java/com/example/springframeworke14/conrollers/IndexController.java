package com.example.springframeworke14.conrollers;

import com.example.springframeworke14.services.NumberService;
import com.example.springframeworke14.services.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController  {

    @Autowired
    private NumberService numberService;

    @GetMapping("/home")
    public String IndexAction(Model model){
        model.addAttribute("message",numberService.getValue());
        return "index.html";
    }
}
