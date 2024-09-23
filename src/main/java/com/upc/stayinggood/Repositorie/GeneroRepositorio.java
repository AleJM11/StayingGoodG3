package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.DTOs.ConsumoCaloriasDTO;
import com.upc.stayinggood.Entities.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepositorio extends JpaRepository<Genero, Integer> {
/*
    @Query("select new com.upc.stayinggood.DTOs.UsuariosPorGeneroDTO(g.nombreGenero, count(g.perfil))  from Genero g group by g.nombreGenero")
    List<ConsumoCaloriasDTO> usuariosPorGenero();*/

    /*
    select nombre_genero, count(p.id_nombre_genero) from genero g
    join perfil_fisico p on g.id = p.id_nombre_genero
    group by g.nombre_genero
    */

    /*
    @Query(value = "SELECT g.nombre_genero, COUNT(u.id) AS cantidad_usuarios\n" +
            "FROM usuario u\n" +
            "JOIN genero g ON u.id = g.id\n" +
            "GROUP BY g.nombre_genero;",nativeQuery = true)
    public List<String[]> Query2();*/
}
