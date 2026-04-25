package br.edu.ifsp.prw3.prw3_2026_1_api.mecanico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Mecanico {

    private String nome;
    private int experiencia;

    public Mecanico(DadosMecanico mecanico) {
        this.nome = mecanico.nome();
        this.experiencia = mecanico.anosExp();
    }

    public void atualizarNome(String nomeAtualizado){
        if (nomeAtualizado!= null){
            this.nome = nomeAtualizado;
        }
    }

    public void atualizarExp(int expAtualizada){
        if (expAtualizada >= 0){
            this.experiencia = expAtualizada;
        }
    }




}
