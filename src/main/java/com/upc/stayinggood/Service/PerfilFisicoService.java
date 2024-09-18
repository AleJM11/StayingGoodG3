package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.PerfilFisico;
import com.upc.stayinggood.Entities.Usuario;

import java.util.List;

public interface PerfilFisicoService {
    public List<PerfilFisico> obtenerPerfilFisico();
    public void insertarPerfilFisico(PerfilFisico perfilFisico);
    //public void eliminarPerfilFisico(Integer idPerfilFisico);
}
