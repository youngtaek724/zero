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
import java.time.Instant;

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
    public RedirectView login(MemberVO memberVO,  HttpServletRequest request, Model model, HttpSession session){
        Instant instant = Instant.now();

        try {
            MemberVO loginMemberVO = memberService.login(memberVO);
            if(loginMemberVO != null){
                session.setAttribute("loginUser", loginMemberVO);
                model.addAttribute("loginMemberVO", loginMemberVO);
                int userNumber = loginMemberVO.getUserNumber();
                memberService.updateLastLogin(userNumber);
                System.out.println("*********************************************************************");
                System.out.println("HELLO "+loginMemberVO.getUserName()+"!!!!!!!!!!!");
                System.out.println("ID : "+loginMemberVO.getUserId());
                System.out.println("NUMBER : "+loginMemberVO.getUserNumber());
                System.out.println("STATE : "+loginMemberVO.getUserStatus());
                System.out.println("LOGIN TIME : "+instant);
                System.out.println("*********************************************************************");
            }else{
                model.addAttribute("error", "Invalid credentials. Please try again.");
                return new RedirectView("/member/login?error=true");
            }

        }catch (Exception e){
            e.printStackTrace();
            return  new RedirectView("/member/login");
        }

        return new RedirectView("/main/home");
    }

    @GetMapping("/logout")
    public RedirectView logout(HttpSession session) {
        if (session.getAttribute("loginUser") != null) {
            session.removeAttribute("loginUser");
        }
        return new RedirectView("/main/home");
    }

}























