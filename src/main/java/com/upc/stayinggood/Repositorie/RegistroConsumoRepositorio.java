package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.DTOs.ConsumoCaloriasDTO;
import com.upc.stayinggood.Entities.RegistroConsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistroConsumoRepositorio extends JpaRepository<RegistroConsumo, Integer> {
    /*
    @Query("select new com.upc.stayinggood.DTOs.ConsumoCaloriasDTO(r.idPerfilfisico.id, sum(r.cantidad * r.alimento.calorias))  from RegistroConsumo r group by r.idPerfilfisico")
    List<ConsumoCaloriasDTO> totalConsumo();*/
}
