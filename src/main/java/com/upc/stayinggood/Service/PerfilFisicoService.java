package com.upc.stayinggood.Service;

import com.upc.stayinggood.DTOs.PerfilesSinConsumoDTO;
import com.upc.stayinggood.DTOs.UsuariosPorGeneroDTO;
import com.upc.stayinggood.Entities.PerfilFisico;

import java.util.List;

public interface PerfilFisicoService {
    public List<PerfilFisico> obtenerPerfilFisico();
    public void insertarPerfilFisico(PerfilFisico perfilFisico);
    //public void eliminarPerfilFisico(Integer idPerfilFisico);

    public List<UsuariosPorGeneroDTO> usuariosPorGenero();

    public List<PerfilesSinConsumoDTO> perfilesSinConsumo();
}
