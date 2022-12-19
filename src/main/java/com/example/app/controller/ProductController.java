package com.example.app.controller;

import com.example.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product/*")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/detail")
    public void productDetail(Model model, int proId) throws ParseException {
        model.addAttribute("menus", productService.showMenu());
        model.addAttribute("product", productService.showProductDetail(proId));
    }
}























