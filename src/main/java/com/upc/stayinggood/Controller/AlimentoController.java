package com.upc.stayinggood.Controller;

import com.upc.stayinggood.DTOs.AlimentoDTO;
import com.upc.stayinggood.Entities.Alimento;
import com.upc.stayinggood.Service.AlimentoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlimentoController {
    @Autowired
    private AlimentoService alimentoService;

    /*@PostMapping("/alimento") //metodo de tipo void que no retorna nada, no eliminar por las dudas xd
    @PreAuthorize("hasRole('ADMIN')")
    public void insertarAlimento(@RequestBody Alimento alimento) {
        alimentoService.insertarAlimento(alimento);
    }*/

    @PostMapping("/alimento") //metodo de tipo Alimento para retornar alimento
    @PreAuthorize("hasRole('ADMIN')")
    public AlimentoDTO insertarAlimento(@RequestBody AlimentoDTO alimentoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Alimento alimento = modelMapper.map(alimentoDTO, Alimento.class);
        alimento = alimentoService.insertarAlimento(alimento);
        return modelMapper.map(alimento, AlimentoDTO.class);
    }
    @GetMapping("/alimento")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public List<Alimento> obtenerAlimento() {
        return alimentoService.obtenerAlimentos();
    }
    @PutMapping("/alimento")
    public AlimentoDTO actualizarAlimento(@RequestBody AlimentoDTO alimentoDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Alimento alimento = modelMapper.map(alimentoDTO, Alimento.class);
        alimento = alimentoService.actualizarAlimento(alimento);
        return modelMapper.map(alimento, AlimentoDTO.class);
    }

    @DeleteMapping("/alimento/{id}")
    public void eliminarAlimento(@PathVariable Integer id) {
        alimentoService.eliminarAlimento(id);
    }


}
