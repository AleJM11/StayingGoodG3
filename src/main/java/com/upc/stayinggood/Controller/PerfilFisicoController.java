package com.upc.stayinggood.Controller;

import com.upc.stayinggood.Entities.PerfilFisico;
import com.upc.stayinggood.Entities.Usuario;
import com.upc.stayinggood.Service.ActividadFisicaService;
import com.upc.stayinggood.Service.PerfilFisicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PerfilFisicoController {
    @Autowired
    private PerfilFisicoService perfilFisicoService;

    @PostMapping("/perfilFisico")
    public PerfilFisico insertarPerfilFisico(@RequestBody PerfilFisico perfilFisico) {
        return perfilFisicoService.insertarPerfilFisico(perfilFisico);
    }

    @GetMapping("/perfilFisico")
    public List<PerfilFisico> obtenerPerfilFisico() {
        return perfilFisicoService.obtenerPerfilFisico();
    }

    @PutMapping("/perfilFisico")
    public PerfilFisico actualizarPerfilFisico(@RequestBody PerfilFisico perfilFisico) {
        perfilFisicoService.actualizarPerfilFisico(perfilFisico);
        return perfilFisicoService.actualizarPerfilFisico(perfilFisico);
    }

    @DeleteMapping("/perfilFisico/{id}")
    public void eliminarPerfilFisico(@PathVariable Integer id) {
        perfilFisicoService.eliminarPerfilFisico(id);
    }
}
