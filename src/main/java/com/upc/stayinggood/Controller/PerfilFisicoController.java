package com.upc.stayinggood.Controller;

import com.upc.stayinggood.DTOs.PerfilesSinConsumoDTO;
import com.upc.stayinggood.DTOs.UsuariosPorGeneroDTO;
import com.upc.stayinggood.Entities.PerfilFisico;
import com.upc.stayinggood.Service.PerfilFisicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PerfilFisicoController {
    @Autowired
    private PerfilFisicoService perfilFisicoService;

    @PostMapping("/perfilFisico")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public void insertarPerfilFisico(@RequestBody PerfilFisico perfilFisico) {
        perfilFisicoService.insertarPerfilFisico(perfilFisico);
    }

    @GetMapping("/perfilFisico")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public List<PerfilFisico> obtenerPerfilFisico() {

        return perfilFisicoService.obtenerPerfilFisico();
    }

    @GetMapping("/query")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public List<UsuariosPorGeneroDTO> usuariosPorGenero() {

        return perfilFisicoService.usuariosPorGenero();
    }

    @GetMapping("/query2")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public List<PerfilesSinConsumoDTO> perfilesSinConsumo() {

        return perfilFisicoService.perfilesSinConsumo();
    }

    /*@PutMapping("/perfilFisico")
    public PerfilFisico actualizarPerfilFisico(@RequestBody PerfilFisico perfilFisico) {
        perfilFisicoService.actualizarPerfilFisico(perfilFisico);
        return perfilFisicoService.actualizarPerfilFisico(perfilFisico);
    }*/

    /*@DeleteMapping("/perfilFisico/{id}")
    public void eliminarPerfilFisico(@PathVariable Integer id) {
        perfilFisicoService.eliminarPerfilFisico(id);
    }*/
}
