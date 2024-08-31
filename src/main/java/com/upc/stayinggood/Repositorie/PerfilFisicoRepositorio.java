package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.Entities.PerfilFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilFisicoRepositorio extends JpaRepository<PerfilFisico, Integer> {
}
