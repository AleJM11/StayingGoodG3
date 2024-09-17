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
@Table(name = "tipo_porcion")
public class TipoPorcion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre_porcion", nullable = false,
            length = Integer.MAX_VALUE)
    private String nombrePorcion;

    //@OneToMany(mappedBy = "idNombrePorcion")
    //private Set<Alimento> alimentos = new LinkedHashSet<>();
}

