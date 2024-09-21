package com.upc.stayinggood.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "namesevice", nullable = false, length = 80)
    private String namesevice;

    @Column(name = "descriptionservice", nullable = false)
    private String descriptionservice;
}
