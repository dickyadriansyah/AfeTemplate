/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aftemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dicky-java
 */
@Controller
public class HelloController {
    
    @RequestMapping("/index")
    public String hello(Model model){
        model.addAttribute("nama1", "APPROVED ACTUAL <= 100%");
        model.addAttribute("nama2", "APPROVED ACTUAL Between 101% to 110%");
        model.addAttribute("nama3", "APPROVED ACTUAL > 110%");
        return "index";
    }
    
    @RequestMapping("/index2")
    public String hello2(Model model){
        model.addAttribute("grafik1", "APPROVED ACTUAL <= 100%");
        model.addAttribute("grafik2", "APPROVED ACTUAL Between 101% to 110%");
        model.addAttribute("grafik3", "APPROVED ACTUAL > 110%");
        return "index2";
    }
    
}
