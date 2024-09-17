package com.upc.stayinggood.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActividadFisicaDTO {
    private Integer id;
    private String descripcion;
    private Double factorActividad;
}
