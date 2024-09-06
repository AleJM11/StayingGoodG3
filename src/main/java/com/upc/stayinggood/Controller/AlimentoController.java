package com.upc.stayinggood.Controller;

import com.upc.stayinggood.Entities.Alimento;
import com.upc.stayinggood.Entities.Genero;
import com.upc.stayinggood.Service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlimentoController {
    @Autowired
    private AlimentoService alimentoService;

    @PostMapping("/alimento")
    public void insertarAlimento(@RequestBody Alimento alimento) {
        alimentoService.insertarAlimento(alimento);
    }

    @GetMapping("/alimento")
    public List<Alimento> obtenerAlimento() {
        return alimentoService.obtenerAlimentos();
    }


}
