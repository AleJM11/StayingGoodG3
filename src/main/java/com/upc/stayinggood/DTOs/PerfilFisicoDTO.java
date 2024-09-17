package com.upc.stayinggood.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PerfilFisicoDTO {
    private Integer id;
    private Integer edad;
    private Double altura;
    private Double peso;
    private Integer idUsuario;
    private Integer idActividadfisica;
    private Integer idGenero;
}

