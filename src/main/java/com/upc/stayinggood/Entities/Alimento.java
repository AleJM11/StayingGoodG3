package com.upc.stayinggood.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "alimentos")
public class Alimento {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = Integer.MAX_VALUE)
    private String nombre;

    @Column(name = "calorias", nullable = false)
    private Integer calorias;

    @Column(name = "proteinas", nullable = false)
    private Integer proteinas;

    @Column(name = "carbohidratos", nullable = false)
    private Integer carbohidratos;

    @Column(name = "grasas", nullable = false)
    private Integer grasas;

    @Column(name = "cantidad", nullable = false)
    private Double cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_nombre_porcion", nullable = false)
    private TipoPorcion idNombrePorcion;

    @OneToMany(mappedBy = "alimento")
    private Set<RegistroConsumo> registroConsumos = new LinkedHashSet<>();

}