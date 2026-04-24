package br.edu.ifsp.prw3.prw3_2026_1_api.conserto;


import br.edu.ifsp.prw3.prw3_2026_1_api.mecanico.DadosMecanico;
import br.edu.ifsp.prw3.prw3_2026_1_api.mecanico.Mecanico;
import br.edu.ifsp.prw3.prw3_2026_1_api.veiculo.DadosVeiculo;
import br.edu.ifsp.prw3.prw3_2026_1_api.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "conserto")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conserto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String entrada;
    private String saida;

    @Embedded
    private Veiculo veiculo;
    @Embedded
    private Mecanico mecanico;


    public Conserto(DadosCadastroConserto cadastroConserto) {
        this.entrada = cadastroConserto.dataEntrada();
        this.saida = cadastroConserto.dataSaida();
        this.veiculo = new Veiculo(cadastroConserto.veiculo());
        this.mecanico = new Mecanico(cadastroConserto.mecanico());
    }


}
