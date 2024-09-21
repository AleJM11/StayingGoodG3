package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.Entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepositorio extends JpaRepository<Service,Integer> {
}
