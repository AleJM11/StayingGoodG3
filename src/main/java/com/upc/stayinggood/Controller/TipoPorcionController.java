package com.upc.stayinggood.Controller;

import com.upc.stayinggood.Entities.TipoPorcion;
import com.upc.stayinggood.Entities.Usuario;
import com.upc.stayinggood.Service.TipoPorcionService;
import com.upc.stayinggood.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apii")
public class TipoPorcionController {
    @Autowired
    private TipoPorcionService tipoPorcionService;

    @PostMapping("/tipoPorcion")
    public TipoPorcion insertarTipoPorcion(@RequestBody TipoPorcion tipoPorcion) {
        return tipoPorcionService.insertarTipoPorcion(tipoPorcion);
    }

    @GetMapping("/tipoPorciones")
    public List<TipoPorcion> obtenerTipoPorcion() {
        return tipoPorcionService.obtenerTipoPorcion();
    }
}
