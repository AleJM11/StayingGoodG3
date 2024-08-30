package com.upc.stayinggood.Controller;

import com.upc.stayinggood.DTOs.UsuarioDTO;
import com.upc.stayinggood.Entities.Usuario;
import com.upc.stayinggood.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public Usuario insertarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.insertarUsuario(usuario);
    }
}
