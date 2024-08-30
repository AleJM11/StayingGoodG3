package com.upc.stayinggood.Controller;

import com.upc.stayinggood.DTOs.UsuarioDTO;
import com.upc.stayinggood.Entities.Usuario;
import com.upc.stayinggood.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public Usuario insertarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.insertarUsuario(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PutMapping("/usuario")
    public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
        usuarioService.actualizarUsuario(usuario);
        return usuarioService.actualizarUsuario(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void eliminarUsuario(@PathVariable Integer id) {
        usuarioService.eliminarUsuario(id);
    }

}
