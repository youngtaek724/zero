package com.example.app.controller;

import com.example.app.domain.vo.AddressVO;
import com.example.app.domain.vo.MemberVO;
import com.example.app.service.AddressService;
import com.example.app.service.MemberService;
import com.example.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {
    private final AddressService addressService;
    private final ProductService productService;
    private final MemberService memberService;
    HttpSession session;
    @GetMapping("login")
    public void login(Model model){
        model.addAttribute("menus", productService.showMenu());
        model.addAttribute("member", new MemberVO());
    }
    @PostMapping("login")
    public RedirectView login(MemberVO memberVO,  HttpServletRequest request){
        session = request.getSession();

        try {
            int userNumber = memberService.login(memberVO);
            session.setAttribute("userNumber", userNumber);
        }catch (Exception e){
            e.printStackTrace();
            return  new RedirectView("/member/login");
        }
        return new RedirectView("/main/home");
    }

    @GetMapping("logout")
    public RedirectView logout(){
        if(session.getAttribute("userNumber")!=null) {
            session.removeAttribute("userNumber");
        }
        return new RedirectView("/main/home");

    }
}























