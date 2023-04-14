package com.metro.distcalc.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metro/distcalc")
public class VechileRestController {

    @GetMapping("/vechiles")
    public String listAllVechiles() {
        return "vechile list";
    }
}
