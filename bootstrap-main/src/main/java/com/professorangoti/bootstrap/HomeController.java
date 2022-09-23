package com.professorangoti.bootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("pag01")
    public String aula01(){
        return "pag01";
    }  

    @GetMapping("pag02")
    public String aula02(){
        return "pag02";
    }  
    
 



}
