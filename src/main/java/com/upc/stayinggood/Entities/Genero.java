package com.upc.stayinggood.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "genero")
public class Genero {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_genero", nullable = false, length = Integer.MAX_VALUE)
    private String nombreGenero;

    @OneToMany(mappedBy = "idGenero")
    private Set<PerfilFisico> perfilFisicos = new LinkedHashSet<>();

}