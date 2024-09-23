package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.DTOs.AlimentosPorCaloriasDTO;
import com.upc.stayinggood.DTOs.UsuariosPorGeneroDTO;
import com.upc.stayinggood.Entities.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlimentoRepositorio extends JpaRepository<Alimento, Integer> {

}
