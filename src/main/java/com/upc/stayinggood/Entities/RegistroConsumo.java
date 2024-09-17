package com.upc.stayinggood.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "registro_consumo")
public class RegistroConsumo {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    //@ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "alimento_id", nullable = false)
    //private Alimento alimento;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_perfilfisico", nullable = false)
    private PerfilFisico idPerfilfisico;

    @OneToMany(mappedBy = "idRegistro")
    private Set<TotalConsumo> totalConsumos = new LinkedHashSet<>();

}