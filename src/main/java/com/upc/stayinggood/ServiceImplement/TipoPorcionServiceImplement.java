package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.Entities.TipoPorcion;
import com.upc.stayinggood.Repositorie.TipoPorcionRepositorio;
import com.upc.stayinggood.Service.TipoPorcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPorcionServiceImplement implements TipoPorcionService {
    @Autowired
    private TipoPorcionRepositorio tipoPorcionRepositorio;

    @Override
    public List<TipoPorcion> obtenerTipoPorcion() {

        return tipoPorcionRepositorio.findAll();
    }

    @Override
    public TipoPorcion insertarTipoPorcion(TipoPorcion tipoPorcion) {

        return tipoPorcionRepositorio.save(tipoPorcion);
    }
}
