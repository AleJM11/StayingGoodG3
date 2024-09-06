package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.Alimento;
import com.upc.stayinggood.Entities.Genero;

import java.util.List;

public interface AlimentoService {
    public List<Alimento> obtenerAlimentos();
    public void insertarAlimento(Alimento alimento);
}
