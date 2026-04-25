package br.edu.ifsp.prw3.prw3_2026_1_api.conserto;

import br.edu.ifsp.prw3.prw3_2026_1_api.mecanico.DadosMecanico;
import br.edu.ifsp.prw3.prw3_2026_1_api.mecanico.Mecanico;
import br.edu.ifsp.prw3.prw3_2026_1_api.veiculo.DadosVeiculo;
import br.edu.ifsp.prw3.prw3_2026_1_api.veiculo.Veiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;


public record DadosListagemConserto(
        String dataEntrada, String dataSaida, Veiculo veiculo, Mecanico mecanico) {

    public DadosListagemConserto(Conserto conserto){
        this(
                conserto.getEntrada(),
                conserto.getSaida(),
                conserto.getVeiculo(),
                conserto.getMecanico());
    }
}


