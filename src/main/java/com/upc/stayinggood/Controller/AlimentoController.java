package com.upc.stayinggood.Controller;

import com.upc.stayinggood.Entities.Alimento;
import com.upc.stayinggood.Entities.Genero;
import com.upc.stayinggood.Service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiiiii")
public class AlimentoController {
    @Autowired
    private AlimentoService alimentoService;

    @PostMapping("/alimento")
    public Alimento insertarAlimento(@RequestBody Alimento alimento) {
        return alimentoService.insertarAlimento(alimento);
    }

    @GetMapping("/alimento")
    public List<Alimento> obtenerAlimento() {
        return alimentoService.obtenerAlimentos();
    }
}
