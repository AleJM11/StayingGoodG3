package com.upc.stayinggood.Service;

import com.upc.stayinggood.Entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario buscarUsuario(Integer idUsuario);
    public List<Usuario> obtenerUsuarios();
    public Usuario insertarUsuario(Usuario usuario);
    public Usuario actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(Integer idUsuario);
}
