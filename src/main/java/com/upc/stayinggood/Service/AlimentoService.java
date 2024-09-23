package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.Alimento;

import java.util.List;

public interface AlimentoService {
    public List<Alimento> obtenerAlimentos();
    public void insertarAlimento(Alimento alimento);

    public Alimento actualizarAlimento(Alimento alimento);
    public void eliminarAlimento(Integer idAlimento);
}
