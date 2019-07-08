package com.hellokoding.springboot.restful.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/")
    public String list(){
        return "index";
    }
    @GetMapping("product")
    public String show(){
        return "product";
    }
    @GetMapping("cart")
    public String shos(){
        return "products";
     
    }
    @GetMapping("categories")
    public String shws(){
        return "categories";
}
    @GetMapping("contact")
    public String hows(){
        return "contact";
    }
}