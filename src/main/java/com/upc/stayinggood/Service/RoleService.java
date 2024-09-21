package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.Role;

import java.util.List;

public interface RoleService {
    public List<Role> obtenerRole();
    public Role insertarRole(Role role);
}
