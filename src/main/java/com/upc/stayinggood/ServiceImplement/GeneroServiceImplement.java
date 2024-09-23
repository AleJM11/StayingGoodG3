package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.Entities.Genero;
import com.upc.stayinggood.Repositorie.GeneroRepositorio;
import com.upc.stayinggood.Service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImplement implements GeneroService {
    @Autowired
    private GeneroRepositorio generoRepositorio;

    @Override
    public List<Genero> obtenerGeneros() {
        return generoRepositorio.findAll();
    }

    @Override
    public Genero insertarGenero(Genero genero) {
        return generoRepositorio.save(genero);
    }
}
