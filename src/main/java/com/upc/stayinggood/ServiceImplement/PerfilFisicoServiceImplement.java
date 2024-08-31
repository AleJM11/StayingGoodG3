package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.Entities.PerfilFisico;
import com.upc.stayinggood.Repositorie.PerfilFisicoRepositorio;
import com.upc.stayinggood.Service.PerfilFisicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilFisicoServiceImplement implements PerfilFisicoService {
    @Autowired
    private PerfilFisicoRepositorio perfilFisicoRepositorio;

    @Override
    public PerfilFisico buscarPerfilFisico(Integer idPerfilFisico) {
        return null;
    }

    @Override
    public List<PerfilFisico> obtenerPerfilFisico() {
        return null;
    }

    @Override
    public PerfilFisico insertarPerfilFisico(PerfilFisico perfilFisico) {
        return perfilFisicoRepositorio.save(perfilFisico);
    }

    @Override
    public PerfilFisico actualizarPerfilFisico(PerfilFisico perfilFisico) {
        if(perfilFisicoRepositorio.findById(perfilFisico.getId()).isPresent())
            return perfilFisicoRepositorio.save(perfilFisico);
        return null;
    }

    @Override
    public void eliminarPerfilFisico(Integer idPerfilFisico) {
        if(perfilFisicoRepositorio.findById(idPerfilFisico).isPresent()){
            perfilFisicoRepositorio.deleteById(idPerfilFisico);
        }
    }
}
