package com.example.app.controller;

import com.example.app.domain.vo.AddressVO;
import com.example.app.service.AddressService;
import com.example.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.thymeleaf.model.IModel;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/address/*")
public class AddressController {
    private final AddressService addressService;
    private final HttpSession session;
    @GetMapping("/list")
    public void list(Model model){
        model.addAttribute("userNumber", session.getAttribute("userNumber"));
        model.addAttribute("address", new AddressVO());
        if(session.getAttribute("userNumber")!=null) {
            model.addAttribute("addresses", addressService.showAll((int) session.getAttribute("userNumber")));
        }
    };

    @PostMapping("/update")
    public void update(AddressVO addressVO, Model model){
        model.addAttribute("info", addressVO);
        if(session.getAttribute("userNumber")!=null) {
            model.addAttribute("userNumber", session.getAttribute("userNumber"));
        }
    }

    @GetMapping("/result")
    public void result(Model model){
        model.addAttribute("address",new AddressVO());
    }

    @PostMapping("/save")
    public void save(AddressVO addressVO){
        addressService.insertAddress(addressVO);
    }

    @GetMapping("/delete")
    public void delete(int userNumber, String memberAddress3){
        System.out.println(userNumber);
        System.out.println(memberAddress3);

        addressService.remove(userNumber, memberAddress3);
    }
}























