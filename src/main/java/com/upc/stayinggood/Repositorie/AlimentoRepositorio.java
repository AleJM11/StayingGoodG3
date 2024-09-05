package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.Entities.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepositorio extends JpaRepository<Alimento, Integer> {
}
