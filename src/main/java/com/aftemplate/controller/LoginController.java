/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aftemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dicky-java
 */
@Controller
@RequestMapping("/pages")
public class LoginController {
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String tampilLogin(){
        return "/pages/login";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String tampilRegister(){
        return "/pages/register";
    }
    
}
