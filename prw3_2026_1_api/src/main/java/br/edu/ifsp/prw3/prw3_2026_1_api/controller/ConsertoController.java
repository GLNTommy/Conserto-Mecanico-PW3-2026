package br.edu.ifsp.prw3.prw3_2026_1_api.controller;

import br.edu.ifsp.prw3.prw3_2026_1_api.conserto.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.List;

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
    public Page<DadosListagemConserto> dadosListagemConsertos(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemConserto::new);
    }

    @GetMapping("algunsDados")
    public List<AlgunsDadosConserto> algunsDadosConsertos(){
        return repository.findAll().stream().map(AlgunsDadosConserto::new).toList();
    }





}
