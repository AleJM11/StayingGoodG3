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
    @JoinColumn(name = "alimento_id", nullable = false)
    private Alimento alimento;

    @ManyToOne
    @JoinColumn(name = "id_perfilfisico", nullable = false)
    private PerfilFisico idPerfilfisico;

    /*@OneToMany(mappedBy = "idRegistro")
    private Set<TotalConsumo> totalConsumos = new LinkedHashSet<>();*/

}