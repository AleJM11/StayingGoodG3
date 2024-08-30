package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.Entities.ActividadFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadFisicaRepositorio extends JpaRepository<ActividadFisica, Integer> {
}
