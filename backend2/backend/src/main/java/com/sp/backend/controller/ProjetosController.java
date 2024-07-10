package com.sp.backend.controller;

import java.util.List;

import com.sp.backend.service.ProjetosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sp.backend.model.Projetos;
import com.sp.backend.repository.ProjetosRepository;

@RequestMapping(path = "/projetos")
@RestController
@CrossOrigin("*")
public class ProjetosController {

    private ProjetosService projetosService;

    public ProjetosController(ProjetosService projetosService, ProjetosRepository projetosRepository) {
        this.projetosService = projetosService;
    }

    @GetMapping("/busca")
    public ResponseEntity<List<Projetos>> listaprojetos() {
        return ResponseEntity.status(200).body(projetosService.listarProjetos());
    }

    @PostMapping("/envio")
    public ResponseEntity<Projetos> criaUsuario(@RequestBody Projetos projetos) {
        return ResponseEntity.status(201).body(projetosService.criarProjetos(projetos));
    }
}
