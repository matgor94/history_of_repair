package com.matgor.History_of_repair.Domain.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "vehicles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull @NotBlank
    private String producent;

    @NotNull @NotBlank
    private String model;

    private Integer yearOfProduction;
    private Integer km;
    private Integer capacity;

//    @OneToMany(mappedBy = "vehicle")
//    private List<Repair> repairs = new ArrayList<>();
}

