package com.upc.stayinggood.ServiceImplement;

import com.upc.stayinggood.Entities.Usuario;
import com.upc.stayinggood.Repositorie.UsuarioRepositorio;
import com.upc.stayinggood.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImplement implements UsuarioService {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Override
    public Usuario buscarUsuario(Integer idUsuario) {
        return usuarioRepositorio.findById(idUsuario).get();
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    @Transactional
    public Usuario insertarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        if(usuarioRepositorio.findById(usuario.getId()).isPresent())
            return usuarioRepositorio.save(usuario);
        return null;
    }

    @Override
    public void eliminarUsuario(Integer idUsuario) {
        if(usuarioRepositorio.findById(idUsuario).isPresent()){
            usuarioRepositorio.deleteById(idUsuario);
        }
    }

    public Integer insertUserRol(Long user_id, Long rol_id) {
        Integer result = 0;
        usuarioRepositorio.insertUserRol(user_id, rol_id);
        return 1;
    }
}
