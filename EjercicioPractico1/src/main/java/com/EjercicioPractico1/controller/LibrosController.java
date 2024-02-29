/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.service.LibrosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author roger
 */
@Controller
@Slf4j
@RequestMapping("/libro")
public class LibrosController {
    @Autowired
    private LibrosService librosService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var libros = librosService.getLibros();
        model.addAttribute("libros", libros);
        model.addAttribute("totalLibros", libros.size());
        return "/libro/listado";
}
}