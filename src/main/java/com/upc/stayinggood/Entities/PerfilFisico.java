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
@Table(name = "perfil_fisico")
public class PerfilFisico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    @Column(name = "altura", nullable = false)
    private Double altura;

    @Column(name = "peso", nullable = false)
    private Double peso;

    @ManyToOne
    @JoinColumn(name = "id_nombre")
    private Usuario usuario;
    //private Usuario idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_descripcion")
    private ActividadFisica actividadFisica;
    //private ActividadFisica idActividadfisica;

    //@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ManyToOne
    @JoinColumn(name = "id_nombre_genero")
    private Genero genero;
    //private Genero idGenero;

    //@OneToMany(mappedBy = "idPerfilfisico")
    //private Set<CalculoMacro> calculoMacros = new LinkedHashSet<>();

    //@OneToMany(mappedBy = "idPerfilfisico")
    //private Set<RegistroConsumo> registroConsumos = new LinkedHashSet<>();

}