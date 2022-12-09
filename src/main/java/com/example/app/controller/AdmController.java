package com.example.app.controller;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.PageDTO;
import com.example.app.service.AdmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdmController {
    private final AdmService admService;
    @GetMapping("/main")
    public void main(){

    }
    // 회원 정보 페이지
    @GetMapping("/userList")
    public void userList(Criteria criteria, Model model){
        if(criteria.getPage() == 0){
            criteria.create(1, 10);
        }
        model.addAttribute("users",admService.findAllUser(criteria) );
        model.addAttribute("pagination", new PageDTO().createPageDTO(criteria,admService.getTotal()));
    }

    // 상품 정보 페이지
    @GetMapping("/productList")
    public void productList(Criteria criteria, Model model){
        if(criteria.getPage() == 0){
            criteria.create(1, 20);
        }
        model.addAttribute("products",admService.fintAllProduct(criteria) );
        model.addAttribute("pagination", new PageDTO().createPageDTO(criteria,admService.getProTotal()));
    }
    // 메인 페이지 이동
    @GetMapping("/goHome")
    public RedirectView goHome(RedirectAttributes redirectAttributes){
        return new RedirectView("/main/home");
    }
}
