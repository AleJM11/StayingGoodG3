package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.TipoPorcion;
import com.upc.stayinggood.Entities.Usuario;

import java.util.List;

public interface TipoPorcionService {
    public List<TipoPorcion> obtenerTipoPorcion();
    public TipoPorcion insertarTipoPorcion(TipoPorcion tipoPorcion);
}