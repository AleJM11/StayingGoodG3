package com.upc.stayinggood.Controller;

import com.upc.stayinggood.Entities.ActividadFisica;
import com.upc.stayinggood.Entities.TipoPorcion;
import com.upc.stayinggood.Service.ActividadFisicaService;
import com.upc.stayinggood.Service.TipoPorcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiii")
public class ActividadFisicaController {
    @Autowired
    private ActividadFisicaService actividadFisicaService;

    @PostMapping("/actividadFisica")
    public ActividadFisica insertarActividadFisica(@RequestBody ActividadFisica actividadFisica) {
        return actividadFisicaService.insertarActividadFisica(actividadFisica);
    }

    @GetMapping("/actividadFisica")
    public List<ActividadFisica> obtenerActividadFisica() {
        return actividadFisicaService.obtenerActividadFisica();
    }
}
