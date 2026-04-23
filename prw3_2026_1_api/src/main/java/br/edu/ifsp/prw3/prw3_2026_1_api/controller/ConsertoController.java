package br.edu.ifsp.prw3.prw3_2026_1_api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conserto")
public class ConsertoController {


    @PostMapping
    public void cadastrar(@RequestBody String json){
        System.out.println(json);
    }





}
