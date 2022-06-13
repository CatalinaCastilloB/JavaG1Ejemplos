package com.generationg1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroController {
    //ruta para desplejar el jsp
    @RequestMapping("/registro")
    public String registro(){
        return "Registro.jsp";
    }

}
