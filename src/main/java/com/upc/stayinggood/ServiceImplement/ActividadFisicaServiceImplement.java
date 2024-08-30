package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.Entities.ActividadFisica;
import com.upc.stayinggood.Repositorie.ActividadFisicaRepositorio;
import com.upc.stayinggood.Repositorie.TipoPorcionRepositorio;
import com.upc.stayinggood.Service.ActividadFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadFisicaServiceImplement implements ActividadFisicaService {
    @Autowired
    private ActividadFisicaRepositorio actividadFisicaRepositorio;

    @Override
    public List<ActividadFisica> obtenerActividadFisica() {
        return actividadFisicaRepositorio.findAll();
    }

    @Override
    public ActividadFisica insertarActividadFisica(ActividadFisica actividadFisica) {
        return actividadFisicaRepositorio.save(actividadFisica);
    }
}
