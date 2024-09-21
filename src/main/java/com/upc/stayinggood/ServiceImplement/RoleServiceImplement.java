package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.Entities.Role;
import com.upc.stayinggood.Repositorie.RoleRepositorio;
import com.upc.stayinggood.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImplement implements RoleService {
    @Autowired
    private RoleRepositorio roleRepositorio;



    @Override
    public List<Role> obtenerRole() {
        return roleRepositorio.findAll();
    }

    @Override
    public Role insertarRole(Role role) {
        return roleRepositorio.save(role);
    }
}
