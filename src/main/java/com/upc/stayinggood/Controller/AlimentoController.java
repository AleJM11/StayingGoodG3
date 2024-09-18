package com.upc.stayinggood.Controller;

import com.upc.stayinggood.DTOs.AlimentoDTO;
import com.upc.stayinggood.Entities.Alimento;
import com.upc.stayinggood.Entities.Genero;
import com.upc.stayinggood.Service.AlimentoService;
import org.modelmapper.ModelMapper;
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
