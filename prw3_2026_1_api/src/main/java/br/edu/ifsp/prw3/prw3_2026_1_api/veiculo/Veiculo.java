package br.edu.ifsp.prw3.prw3_2026_1_api.veiculo;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Veiculo {

   private String marca;
   private String modelo;
   private String ano;
   private String cor;

    public Veiculo(DadosVeiculo veiculo) {
        this.marca = veiculo.marca();
        this.modelo = veiculo.modelo();
        this.ano = veiculo.ano();
        this.cor = veiculo.cor();
    }
}
