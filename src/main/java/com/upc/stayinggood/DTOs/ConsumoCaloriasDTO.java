package com.upc.stayinggood.DTOs;

import com.upc.stayinggood.Entities.Alimento;
import com.upc.stayinggood.Entities.PerfilFisico;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConsumoCaloriasDTO {
    private Integer id_perfilFisico;
    private Long consumoTotalCalorias;
    //private PerfilFisico perfilFisico;
    //private Alimento alimento;
}
