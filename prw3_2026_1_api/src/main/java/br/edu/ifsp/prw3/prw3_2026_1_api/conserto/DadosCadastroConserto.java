package br.edu.ifsp.prw3.prw3_2026_1_api.conserto;

import br.edu.ifsp.prw3.prw3_2026_1_api.mecanico.DadosMecanico;
import br.edu.ifsp.prw3.prw3_2026_1_api.veiculo.DadosVeiculo;

public record DadosCadastroConserto(String dataEntrada, String dataSaida, DadosVeiculo veiculo, DadosMecanico  mecanico) {
}
