package com.upc.stayinggood.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actividad_fisica")
public class ActividadFisica {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "descripcion", nullable = false, length = Integer.MAX_VALUE)
    private String descripcion;

    @Column(name = "factor_actividad", nullable = false)
    private Double factorActividad;

    @OneToMany(mappedBy = "idActividadfisica")
    private Set<PerfilFisico> perfilFisicos = new LinkedHashSet<>();

}