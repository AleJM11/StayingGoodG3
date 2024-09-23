package com.upc.stayinggood.Repositorie;

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

    /*
    select nombre_genero, count(p.id_nombre_genero) from genero g
    join perfil_fisico p on g.id = p.id_nombre_genero
    group by g.nombre_genero
    */
}
