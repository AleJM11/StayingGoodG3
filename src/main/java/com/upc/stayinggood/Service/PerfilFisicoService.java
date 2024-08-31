package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.PerfilFisico;
import com.upc.stayinggood.Entities.Usuario;

import java.util.List;

public interface PerfilFisicoService {
    public PerfilFisico buscarPerfilFisico(Integer idPerfilFisico);
    public List<PerfilFisico> obtenerPerfilFisico();
    public PerfilFisico insertarPerfilFisico(PerfilFisico perfilFisico);
    public PerfilFisico actualizarPerfilFisico(PerfilFisico perfilFisico);
    public void eliminarPerfilFisico(Integer idPerfilFisico);
}
