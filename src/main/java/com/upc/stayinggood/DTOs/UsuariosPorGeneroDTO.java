package com.upc.stayinggood.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UsuariosPorGeneroDTO {
    private String genero_nombre;
    private Long cantidad;
}
