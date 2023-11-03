package com.bddev.springboot.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
/*
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
*/
public record AlunoRecordDto(@NotBlank String nome,
                             @NotNull int idade,
                             @NotBlank String nomeProfessor,
                             @NotNull double notaPrimeiroSemestre,
                             @NotNull double notaSegundoSemestre,
                             @NotBlank String numeroSala
) {

}
