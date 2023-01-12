package com.example.app.controller;

import com.example.app.service.BoardService;
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
    private final BoardService boardService;
    @GetMapping("/detail")
    public void productDetail(Model model, int proId) throws ParseException {
        model.addAttribute("menus", productService.showMenu());
        model.addAttribute("product", productService.showProductDetail(proId));
        model.addAttribute("inquirys", boardService.showAllInquiry(proId));
    }
    @GetMapping("/list")
    public void productList(Model model, String code){
        model.addAttribute("menus", productService.showMenu());
        if(code==null){ code = "00";}
        model.addAttribute("products", productService.showProductByCondition(code));
        model.addAttribute("categories", productService.showCategory());
        model.addAttribute("code", code);
        model.addAttribute("count",productService.getProduct());
    }


}























