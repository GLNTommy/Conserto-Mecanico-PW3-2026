package br.edu.ifsp.prw3.prw3_2026_1_api.conserto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoConserto(

        @NotNull
        Long id,

        String dataSaida,

        String nomeMecanico,
        int anosExp) {



}
