package com.sp.backend.controller;

import java.util.List;

import com.sp.backend.service.ServicosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sp.backend.model.Servicos;
import com.sp.backend.repository.ServicosRepository;

@RequestMapping(path = "/servicos")
@RestController
@CrossOrigin("*")
public class ServicosController {

    private ServicosService servicosService;

    public ServicosController(ServicosService servicosService, ServicosRepository servicosRepository) {
        this.servicosService = servicosService;
    }


    @GetMapping("/busca")
    public ResponseEntity<List<Servicos>> listaServicos() {
        return ResponseEntity.status(200).body(servicosService.listarServicos());
    }

    @PostMapping("/envio")
    public ResponseEntity<Servicos> criaUsuario(@RequestBody Servicos servicos) {
        return ResponseEntity.status(201).body(servicosService.criarServicos(servicos));
    }
}
