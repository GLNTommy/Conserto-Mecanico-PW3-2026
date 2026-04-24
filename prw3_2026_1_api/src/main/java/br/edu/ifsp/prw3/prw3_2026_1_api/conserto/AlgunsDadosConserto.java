package br.edu.ifsp.prw3.prw3_2026_1_api.conserto;

public record AlgunsDadosConserto(String dataEntrada, String dataSaida, String nomeMecanico, String marcaVeiculo, String modeloVeiculo) {


    public AlgunsDadosConserto(Conserto conserto){
        this(
                conserto.getEntrada(),
                conserto.getSaida(),
                conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo()
        );
    }
}
