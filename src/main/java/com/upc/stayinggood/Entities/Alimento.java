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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alimentos")
public class Alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer calorias;
    private Integer proteinas;
    private Integer carbohidratos;
    private Integer grasas;
    private Double cantidad;
    @ManyToOne
    @JoinColumn(name = "id_nombre_porcion")
    private TipoPorcion tipoPorcion;

    //@OneToMany(mappedBy = "alimento")
    //private Set<RegistroConsumo> registroConsumos = new LinkedHashSet<>();
}