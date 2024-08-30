package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.Entities.TipoPorcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPorcionRepositorio extends JpaRepository<TipoPorcion, Integer> {
}
