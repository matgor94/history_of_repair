package com.matgor.History_of_repair.Domain.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "vehicles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull @NotBlank
    private String producent;

    @NotNull @NotBlank
    private String model;

    @NotNull @NotBlank
    private int yearOfProduction;

    @NotNull @NotBlank
    private int km;

    @NotNull @NotBlank
    private int capacity;
}
