package com.upc.stayinggood.Controller;

import com.upc.stayinggood.Entities.Usuario;
import com.upc.stayinggood.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PasswordEncoder bcrypt;
    /*@Autowired
    private UsuarioService usuarioService;*/

    @PostMapping("/usuario")
    @PreAuthorize("hasRole('ADMIN')")
    public Usuario insertarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.insertarUsuario(usuario);
    }

    @PostMapping("/usuarioSeguridad")
    @PreAuthorize("hasRole('ADMIN')")
    public void createUser(@RequestBody Usuario usuario) {
        String bcryptPassword = bcrypt.encode(usuario.getPassword());
        usuario.setPassword(bcryptPassword);
        usuarioService.insertarUsuario(usuario);
    }

    @PostMapping("/insertar/{user_id}/{rol_id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Integer> saveUseRol(@PathVariable("user_id") Long user_id,
                                              @PathVariable("rol_id") Long rol_id){
        return new ResponseEntity<Integer>(usuarioService.insertUserRol(user_id, rol_id), HttpStatus.OK);
        //return new ResponseEntity<Integer>(uService.insertUserRol2(user_id, rol_id),HttpStatus.OK);
    }

    @GetMapping("/usuarios")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
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
