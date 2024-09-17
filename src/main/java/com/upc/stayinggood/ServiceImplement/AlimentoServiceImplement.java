package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.Entities.Alimento;
import com.upc.stayinggood.Repositorie.AlimentoRepositorio;
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
    public void insertarAlimento(Alimento alimento) {
        alimentoRepositorio.save(alimento);
    }

    @Override
    public Alimento actualizarAlimento(Alimento alimento) {
        if(alimentoRepositorio.findById(alimento.getId()).isPresent())
            return alimentoRepositorio.save(alimento);
        return null;
    }

    @Override
    public void eliminarAlimento(Integer idAlimento) {
        if(alimentoRepositorio.findById(idAlimento).isPresent()){
            alimentoRepositorio.deleteById(idAlimento);
        }
    }

}
