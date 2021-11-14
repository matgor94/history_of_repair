package com.matgor.History_of_repair.Domain.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "repair")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Repair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank @NotNull
    private String desctription;

    private int partsCost;
    private int jobCost;

    @ManyToOne
    private Vehicle vehicle;
}
