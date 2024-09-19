package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.Entities.RegistroConsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroConsumoRepositorio extends JpaRepository<RegistroConsumo, Integer> {
}
