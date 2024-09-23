package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.Genero;

import java.util.List;

public interface GeneroService {
    public List<Genero> obtenerGeneros();
    public Genero insertarGenero(Genero genero);
}
