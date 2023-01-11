package com.example.app.controller;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage/*")
public class MypageController {
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
    public RedirectView login(Model model, MemberVO memberVO, HttpServletRequest request, RedirectAttributes redirectAttributes){

           session = request.getSession();
           try {
               int userNumber = memberService.login(memberVO);
               session.setAttribute("userNumber", userNumber);
           }catch (Exception e){
               e.printStackTrace();
               redirectAttributes.addFlashAttribute("result",-1);
               return  new RedirectView("/mypage/login");
           }
           return new RedirectView("/mypage/update");
       }


    @GetMapping("logout")
    public RedirectView logout(){
        session.removeAttribute("userNumber");
        return new RedirectView("/main/home");
    }

    @GetMapping("update")
    public void update(Model model){
        model.addAttribute("menus", productService.showMenu());
        if(session.getAttribute("userNumber")!=null) {
            model.addAttribute("userNumber", session.getAttribute("userNumber"));
        }
    }

    @GetMapping("myaddress")
    public void myaddress(Model model,HttpServletRequest request){
        session=request.getSession();
        model.addAttribute("menus", productService.showMenu());
        if(session.getAttribute("userNumber")!=null) {
            int userNumber = (int) session.getAttribute("userNumber");
            model.addAttribute("userNumber", userNumber);
            model.addAttribute("address", addressService.showAll(userNumber));
        }
    }
    @GetMapping("myorder")
    public void myorder(Model model, HttpServletRequest request){
        session=request.getSession();
        model.addAttribute("menus", productService.showMenu());
        if(session.getAttribute("userNumber")!=null){
            int userNumber = (int)session.getAttribute("userNumber");
            model.addAttribute("userNumber", userNumber);
        }
    }

    @GetMapping("myinquiry")
    public void myinquiry(Model model, HttpServletRequest request){
        session=request.getSession();
        model.addAttribute("menus", productService.showMenu());
        if(session.getAttribute("userNumber")!=null){
            int userNumber = (int)session.getAttribute("userNumber");
            model.addAttribute("userNumber", userNumber);
        }
    }
}























