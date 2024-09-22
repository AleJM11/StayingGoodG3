package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.DTOs.ConsumoCaloriasDTO;
import com.upc.stayinggood.Entities.RegistroConsumo;
import com.upc.stayinggood.Repositorie.RegistroConsumoRepositorio;
import com.upc.stayinggood.Service.RegistroConsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroConsumoServiceImplement implements RegistroConsumoService {
    @Autowired
    private RegistroConsumoRepositorio registroConsumoRepositorio;


    @Override
    public List<RegistroConsumo> obtenerRegistroConsumo() {
        return registroConsumoRepositorio.findAll();
    }

    @Override
    public RegistroConsumo insertarRegistroConsumo(RegistroConsumo registroConsumo) {
        return registroConsumoRepositorio.save(registroConsumo);
    }

    @Override
    public RegistroConsumo actualizarRegistroConsumo(RegistroConsumo registroConsumo) {
        if(registroConsumoRepositorio.findById(registroConsumo.getId()).isPresent())
            return registroConsumoRepositorio.save(registroConsumo);
        return null;
    }

    /*
    @Override
    public List<ConsumoCaloriasDTO> totalConsumo() {
        return registroConsumoRepositorio.totalConsumo();
    }*/
}
