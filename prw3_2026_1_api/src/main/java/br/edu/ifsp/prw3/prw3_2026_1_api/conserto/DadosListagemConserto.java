package br.edu.ifsp.prw3.prw3_2026_1_api.conserto;

import br.edu.ifsp.prw3.prw3_2026_1_api.mecanico.DadosMecanico;
import br.edu.ifsp.prw3.prw3_2026_1_api.veiculo.DadosVeiculo;
import br.edu.ifsp.prw3.prw3_2026_1_api.veiculo.Veiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;


public record DadosListagemConserto(
        String dataEntrada, String dataSaida, DadosVeiculo veiculo, DadosMecanico mecanico) {

    public DadosListagemConserto(Conserto conserto){
        this(
                conserto.getEntrada(),
                conserto.getSaida(),
                new DadosVeiculo(conserto.getVeiculo().getMarca(), conserto.getVeiculo().getModelo(), conserto.getVeiculo().getAno(), conserto.getVeiculo().getCor()),
                new DadosMecanico(conserto.getMecanico().getNome(), conserto.getMecanico().getExperiencia()));
    }
}


