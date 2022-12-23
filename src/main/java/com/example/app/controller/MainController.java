package com.example.app.controller;

import com.example.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main/*")
public class MainController {
    private final ProductService productService;

    @GetMapping("/home")
    public void home(Model model){
        model.addAttribute("products", productService.showAll());
        model.addAttribute("menus", productService.showMenu());
    }
    @GetMapping("/cart")
    public void myCart(Model model){
        model.addAttribute("menus", productService.showMenu());
    }
    @GetMapping("/helpDesk")
    public void help(Model model){
        model.addAttribute("menus", productService.showMenu());
    }

    @GetMapping("/addressList")
    public void addressList(){};

    @GetMapping("/result")
    public void addResult(){

    }

}























