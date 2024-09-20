package com.upc.stayinggood.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "total_consumo")
public class TotalConsumo { ////esta entidad se va a eliminar
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cantidad_calorias", nullable = false)
    private Double cantidadCalorias;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_registro", nullable = false)
    private RegistroConsumo idRegistro;

}