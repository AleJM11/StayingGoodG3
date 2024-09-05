package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.Entities.Alimento;
import com.upc.stayinggood.Entities.Genero;
import com.upc.stayinggood.Repositorie.AlimentoRepositorio;
import com.upc.stayinggood.Repositorie.GeneroRepositorio;
import com.upc.stayinggood.Service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoServiceImplement implements AlimentoService {
    @Autowired
    private AlimentoRepositorio alimentoRepositorio;
    @Override
    public List<Alimento> obtenerAlimentos() {
        return alimentoRepositorio.findAll();
    }

    @Override
    public Alimento insertarAlimento(Alimento alimento) {
        return alimentoRepositorio.save(alimento);
    }
}
