package br.edu.ifsp.prw3.prw3_2026_1_api.controller;

import br.edu.ifsp.prw3.prw3_2026_1_api.conserto.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("conserto")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroConserto dados){
        repository.save(new Conserto(dados));
    }

    @GetMapping
    public ResponseEntity dadosListagemConsertos(Pageable paginacao){
        var pagina = repository.findAll(paginacao).map(DadosListagemConserto::new);
        return ResponseEntity.ok(pagina);
    }

    @GetMapping("algunsDados")
    public ResponseEntity algunsDadosConsertos(){
        return ResponseEntity.ok(repository.findAllByAtivoTrue().stream().map(AlgunsDadosConserto::new).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity getConsertoById(@PathVariable Long id) {
        Optional<Conserto> medicoOptional = repository.findById(id);
        if (medicoOptional.isPresent()) {
            Conserto conserto = medicoOptional.get();
            return ResponseEntity.ok(new DadosListagemConserto(conserto));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        Conserto conserto = repository.getReferenceById(id);
        conserto.excluir();
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoConserto dados) {
        Conserto conserto = repository.getReferenceById( dados.id() );
        conserto.atualizarInformacoes(dados);
        return ResponseEntity.ok(new DadosListagemConserto(conserto));
    }



}
