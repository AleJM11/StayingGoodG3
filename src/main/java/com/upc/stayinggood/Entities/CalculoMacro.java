package com.upc.stayinggood.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "calculo_macros")
public class CalculoMacro { //esta entidad se va a eliminar porque su resultado se puede desarrollar con un querie
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "calorias", nullable = false)
    private Double calorias;

    @Column(name = "proteinas", nullable = false)
    private Double proteinas;

    @Column(name = "carbohidratos", nullable = false)
    private Double carbohidratos;

    @Column(name = "grasas", nullable = false)
    private Double grasas;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_perfilfisico", nullable = false)
    private PerfilFisico idPerfilfisico;

}