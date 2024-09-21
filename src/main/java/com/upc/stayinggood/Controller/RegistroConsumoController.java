package com.upc.stayinggood.Controller;

import com.upc.stayinggood.DTOs.RegistroConsumoDTO;
import com.upc.stayinggood.Entities.RegistroConsumo;
import com.upc.stayinggood.Service.RegistroConsumoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/RegistroConsumo")
public class RegistroConsumoController {
    @Autowired
    private RegistroConsumoService registroConsumoService;

    @PostMapping("/InsertarRegistro")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public RegistroConsumoDTO insertarRegistroConsumo(@RequestBody RegistroConsumoDTO registroConsumoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        RegistroConsumo registroConsumo = modelMapper.map(registroConsumoDTO, RegistroConsumo.class);
        registroConsumoService.insertarRegistroConsumo(registroConsumo);
        registroConsumoDTO = modelMapper.map(registroConsumo, RegistroConsumoDTO.class);
        return registroConsumoDTO;
    }

    @PutMapping("/ModificarRegistroConsumo")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public RegistroConsumoDTO actualizarRegistroConsumo(@RequestBody RegistroConsumoDTO registroConsumoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        RegistroConsumo registroConsumo = modelMapper.map(registroConsumoDTO, RegistroConsumo.class);
        registroConsumo = registroConsumoService.actualizarRegistroConsumo(registroConsumo);
        return modelMapper.map(registroConsumo, RegistroConsumoDTO.class);
    }


    @GetMapping("/ConsultaRegistroConsumo")
    public List<RegistroConsumo> obtenerRegistroConsumo() {
        return registroConsumoService.obtenerRegistroConsumo();
    }
}
