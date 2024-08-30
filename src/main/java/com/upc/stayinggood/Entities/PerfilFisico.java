package com.upc.stayinggood.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "perfil_fisico")
public class PerfilFisico {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    @Column(name = "altura", nullable = false)
    private Double altura;

    @Column(name = "peso", nullable = false)
    private Double peso;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario idUsuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_actividadfisica", nullable = false)
    private ActividadFisica idActividadfisica;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_genero", nullable = false)
    private Genero idGenero;

    @OneToMany(mappedBy = "idPerfilfisico")
    private Set<CalculoMacro> calculoMacros = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idPerfilfisico")
    private Set<RegistroConsumo> registroConsumos = new LinkedHashSet<>();

}