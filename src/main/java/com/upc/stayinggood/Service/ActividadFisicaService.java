package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.ActividadFisica;
import com.upc.stayinggood.Entities.TipoPorcion;

import java.util.List;

public interface ActividadFisicaService {
    public List<ActividadFisica> obtenerActividadFisica();
    public ActividadFisica insertarActividadFisica(ActividadFisica actividadFisica);
}
