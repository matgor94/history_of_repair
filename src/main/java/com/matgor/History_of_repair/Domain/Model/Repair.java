package com.matgor.History_of_repair.Domain.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity(name = "repair")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Repair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank @NotNull
    private String desctription;

    @NotBlank @NotNull
    private int partsCost;

    @NotBlank @NotNull
    private int jobCost;
}
