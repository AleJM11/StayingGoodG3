package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.DTOs.EstimarMacrosDTO;
import com.upc.stayinggood.DTOs.PerfilesSinConsumoDTO;
import com.upc.stayinggood.DTOs.UsuariosPorGeneroDTO;
import com.upc.stayinggood.Entities.PerfilFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerfilFisicoRepositorio extends JpaRepository<PerfilFisico, Integer> {
    @Query("select new com.upc.stayinggood.DTOs.UsuariosPorGeneroDTO(p.genero.nombreGenero, count(p.genero.id)) from PerfilFisico p group by p.genero.nombreGenero")
    List<UsuariosPorGeneroDTO> usuariosPorGenero();

    @Query("select new com.upc.stayinggood.DTOs.PerfilesSinConsumoDTO(p.id) from PerfilFisico p left join RegistroConsumo c on p.id = c.id where c.id is null group by p.id")
    List<PerfilesSinConsumoDTO> perfilesSinConsumo();



    @Query("select new com.upc.stayinggood.DTOs.EstimarMacrosDTO(p.id, sum((p.peso * 13.3 + p.altura * 4.8 + p.edad * 5.6)*p.actividadFisica.factorActividad)) from PerfilFisico p group by p.id")
    List<EstimarMacrosDTO> estimarMacros();

}
