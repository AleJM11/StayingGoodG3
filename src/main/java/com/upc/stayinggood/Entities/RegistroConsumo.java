package com.upc.stayinggood.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "registro_consumo")
public class RegistroConsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    //@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ManyToOne
    @JoinColumn(name = "alimento_id")
    private Alimento alimento;

    @ManyToOne
    @JoinColumn(name = "perfilfisico_id")
    private PerfilFisico perfilfisico;

}