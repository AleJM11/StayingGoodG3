package com.upc.stayinggood.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDTO {
    private int id;
    private String namesevice;
    private String descriptionservice;
}
