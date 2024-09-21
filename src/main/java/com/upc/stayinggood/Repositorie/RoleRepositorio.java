package com.upc.stayinggood.Repositorie;

import com.upc.stayinggood.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositorio extends JpaRepository<Role, Long> {
}
