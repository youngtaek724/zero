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

@Controller
@RequiredArgsConstructor
@RequestMapping("/address/*")
public class AddressController {
    private final AddressService addressService;

    @GetMapping("/list")
    public void list(Model model){
        model.addAttribute("addresses", addressService.showAll(2));
    };

    @GetMapping("/result")
    public void result(Model model){
        model.addAttribute("address",new AddressVO());
    }

    @PostMapping("/save")
    public void save(AddressVO addressVO){
        addressService.insertAddress(addressVO);
    }

}























