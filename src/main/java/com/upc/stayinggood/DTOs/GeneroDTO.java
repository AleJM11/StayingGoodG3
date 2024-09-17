package com.upc.stayinggood.DTOs;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class GeneroDTO {
    private Integer id;
    private String nombreGenero;
    private Integer idGenero;
}

