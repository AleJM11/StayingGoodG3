package com.upc.stayinggood.Controller;

import com.upc.stayinggood.DTOs.TipoPorcionDTO;
import com.upc.stayinggood.Entities.TipoPorcion;
import com.upc.stayinggood.Entities.Usuario;
import com.upc.stayinggood.Service.TipoPorcionService;
import org.modelmapper.ModelMapper;
import com.upc.stayinggood.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoPorcionController {
    @Autowired
    private TipoPorcionService tipoPorcionService;

    /*@PostMapping("/tipoPorcion")
    public TipoPorcion insertarTipoPorcion(@RequestBody TipoPorcion tipoPorcion) {
        return tipoPorcionService.insertarTipoPorcion(tipoPorcion);
    }*/

    @PostMapping("/tipoPorcion")
    @PreAuthorize("hasRole('ADMIN')")
    public TipoPorcionDTO insertarTipoPorcion(@RequestBody TipoPorcionDTO tipoPorcionDTO){
        ModelMapper modelMapper = new ModelMapper();
        TipoPorcion tipoPorcion = modelMapper.map(tipoPorcionDTO, TipoPorcion.class);
        tipoPorcionService.insertarTipoPorcion(tipoPorcion);
        tipoPorcionDTO = modelMapper.map(tipoPorcion, TipoPorcionDTO.class);
        return tipoPorcionDTO;
    }


    @GetMapping("/tipoPorciones")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public List<TipoPorcion> obtenerTipoPorcion() {
        return tipoPorcionService.obtenerTipoPorcion();
    }
}
