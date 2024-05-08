package com.example.app.controller;

import com.example.app.domain.vo.MemberVO;
import com.example.app.domain.vo.ProductDTO;
import com.example.app.domain.vo.ProductVO;
import com.example.app.service.BoardService;
import com.example.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product/*")
public class ProductController {
    private final ProductService productService;
    private final BoardService boardService;
    private final HttpSession session;
    @GetMapping("/detail")
    public void productDetail(Model model, int proId, HttpSession session) throws ParseException {
        MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
        model.addAttribute("loginUser", loginUser);
        model.addAttribute("userNumber",session.getAttribute("loginUser")!=null?((MemberVO) session.getAttribute("loginUser")).getUserNumber():-1);
        model.addAttribute("menus", productService.showMenu());
        model.addAttribute("product", productService.showProductDetail(proId));
        model.addAttribute("inquirys", boardService.showAllInquiry(proId));

    }
    @GetMapping("/list")
    public void productList(Model model, String code){
        MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
        int userNumber = loginUser==null?-1:loginUser.getUserNumber();
        model.addAttribute("loginUser", loginUser);
        model.addAttribute("userNumber", userNumber);

        model.addAttribute("menus", productService.showMenu());
        if(code==null){ code = "00";}
        model.addAttribute("products", productService.showProductByCondition(code));
        model.addAttribute("categories", productService.showCategory());
        model.addAttribute("code", code);
        model.addAttribute("count",productService.getProduct());
    }

    @GetMapping("/read")
    public void productRead(){

    }

    @GetMapping("/update")
    public void productUpdate(Model model){
        model.addAttribute("menus", productService.showMenu());
        model.addAttribute("product", new ProductDTO());
    }

    @PostMapping("/update")
    public RedirectView productUpdate(ProductDTO productDTO){
        System.out.println(productDTO);
        try{
            productService.saveProduct(productDTO);
        }catch (Exception e){
            System.out.println("error : "+e.getStackTrace());
            System.out.println("error : "+e.getMessage());
        }
        return new RedirectView("/product/update");
    }

    @GetMapping("/delete")
    public RedirectView delete(int proId){
        productService.delete(proId);
        return new RedirectView("/admin/productList");
    }

    @GetMapping("/test")
    public void test(){

    }
}
























