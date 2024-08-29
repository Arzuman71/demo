package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class MainController {

    @GetMapping("/1/{str}")
    public Long item1(@PathVariable("str")String str) {
        String regex = "^[a-zA-Z0-9]+$";
        if (str.matches(regex)) {
            System.out.println(str +"--correct msg");
            return 17L;
        }
        return -1l;
    }

    @GetMapping("/2/{str}")
    public String[] item2(@PathVariable("str")String str) {
        String regex = "^[a-zA-Z0-9]+$";
        if (str.matches(regex)) {
            System.out.println(str +"--correct msg");
            return str.split(" ");}

        return new String[0];
    }

}
