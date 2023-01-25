package com.example.app.controller;

import com.example.app.service.AddressService;
import com.example.app.service.CartService;
import com.example.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.*;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main/*")
public class MainController {
    private final ProductService productService;
    private final CartService cartService;
    private final HttpSession session;
    private final AddressService addressService;

    @GetMapping("/home")
    public void home(Model model){
        model.addAttribute("products", productService.showAll());
        model.addAttribute("menus", productService.showMenu());
        if(session.getAttribute("userNumber")!=null) {
            model.addAttribute("userNumber", session.getAttribute("userNumber"));
        }
    }
    @GetMapping("/cart")
    public void myCart(Model model){
        Object userNumber = session.getAttribute("userNumber");
        model.addAttribute("userNumber", userNumber);
        model.addAttribute("menus", productService.showMenu());
        System.out.println(productService.showMenu());
        if(userNumber!=null){
            model.addAttribute("products",cartService.showAll((int)userNumber));
                if((addressService.findBase((int)userNumber))!=null){
                    model.addAttribute("address", addressService.findBase((int)userNumber));
                }
        }
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

    @GetMapping("/test")
    public  void test(){

    }

}























