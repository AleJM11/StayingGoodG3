package com.upc.stayinggood.Controller;

import com.upc.stayinggood.Entities.Genero;
import com.upc.stayinggood.Entities.Usuario;
import com.upc.stayinggood.Service.GeneroService;
import com.upc.stayinggood.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @PostMapping("/genero")
    public Genero insertarGenero(@RequestBody Genero genero) {
        return generoService.insertarGenero(genero);
    }

    @GetMapping("/genero")
    public List<Genero> obtenerGenero() {
        return generoService.obtenerGeneros();
    }
}