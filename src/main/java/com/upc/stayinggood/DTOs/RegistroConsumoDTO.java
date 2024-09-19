package com.upc.stayinggood.DTOs;

import com.upc.stayinggood.Entities.Alimento;
import com.upc.stayinggood.Entities.PerfilFisico;
import com.upc.stayinggood.Entities.TotalConsumo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegistroConsumoDTO {
    private Integer id;


    private Integer cantidad;


    private Alimento alimento;


    private PerfilFisico idPerfilfisico;
    //private Set<TotalConsumo> totalConsumos = new LinkedHashSet<>();
}
