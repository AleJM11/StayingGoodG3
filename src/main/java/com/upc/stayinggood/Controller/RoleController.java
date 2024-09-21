package com.upc.stayinggood.Controller;

import com.upc.stayinggood.DTOs.RoleDTO;
import com.upc.stayinggood.Entities.Role;
import com.upc.stayinggood.Service.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/RoleFind")
    public List<Role> obtener() {
        return roleService.obtenerRole();
    }

    @PostMapping("/RoleCreate")
    public RoleDTO insertar(@RequestBody RoleDTO roleDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Role role = modelMapper.map(roleDTO, Role.class);
        roleService.insertarRole(role);
        roleDTO = modelMapper.map(role, RoleDTO.class);
        return roleDTO;
    }
}
