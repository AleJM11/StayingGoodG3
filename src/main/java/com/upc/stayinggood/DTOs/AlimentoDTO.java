package com.upc.stayinggood.DTOs;

import com.upc.stayinggood.Entities.TipoPorcion;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AlimentoDTO {
    private Integer id;
    private String nombre;
    private Integer calorias;
    private Integer proteinas;
    private Integer carbohidratos;
    private Integer grasas;
    private Double cantidad;
    private TipoPorcion tipoPorcion;
}
