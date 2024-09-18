package com.upc.stayinggood.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre_genero", nullable = false, length = Integer.MAX_VALUE)
    private String nombreGenero;

    //@OneToMany(mappedBy = "id_nombre_genero")
    /*@OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_genero")
    private Set<PerfilFisico> perfilFisicos = new LinkedHashSet<>();*/

}