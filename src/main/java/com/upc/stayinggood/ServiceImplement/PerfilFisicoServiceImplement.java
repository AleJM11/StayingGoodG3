package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.DTOs.PerfilesSinConsumoDTO;
import com.upc.stayinggood.DTOs.UsuariosPorGeneroDTO;
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
    public List<PerfilFisico> obtenerPerfilFisico() {
        return perfilFisicoRepositorio.findAll();
    }

    @Override
    public void insertarPerfilFisico(PerfilFisico perfilFisico) {
        perfilFisicoRepositorio.save(perfilFisico);
    }

    @Override
    public List<UsuariosPorGeneroDTO> usuariosPorGenero() {
        return perfilFisicoRepositorio.usuariosPorGenero();
    }

    @Override
    public List<PerfilesSinConsumoDTO> perfilesSinConsumo() {
        return perfilFisicoRepositorio.perfilesSinConsumo();
    }

    /*@Override
    public void eliminarPerfilFisico(Integer idPerfilFisico) {
        if(perfilFisicoRepositorio.findById(idPerfilFisico).isPresent()){
            perfilFisicoRepositorio.deleteById(idPerfilFisico);
        }
    }*/
}
