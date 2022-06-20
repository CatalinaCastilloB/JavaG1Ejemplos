package com.generationg1.controller;


import com.generationg1.models.Auto;
import com.generationg1.models.Usuario;
import com.generationg1.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/ingresoAutomovil")
public class automovilController {

    @Autowired
    private AutoService autoService;

    @RequestMapping("")
    public String auto(@ModelAttribute("auto") Auto auto){
        return "ingresoAuto.jsp";
    }



    @PostMapping("/Auto") //todos los atributos de usuario llenos
    public String guardarAuto(@Valid @ModelAttribute("auto") Auto auto,
                                 BindingResult resultado, Model model){
        if(resultado.hasErrors()){//se detiene la ejecucion para mostrar mensajes de error, captura si hay un error en el ingreso de datos
            model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
            return "ingresoAuto.jsp";
        }

        //enviar obj al service
        autoService.saveAuto(auto); //se esta creando un metodo aqui mismo, el programa automaticamente crea el metodo en el archivo de UsusarioService.java


        // obtener una lista de autos
        List<Auto> listaAutos = autoService.findAll();
        // Pasamos la lista de auto al jsp
        model.addAttribute("autosCapturados", listaAutos);

        return "Autos.jsp";
    }
}
