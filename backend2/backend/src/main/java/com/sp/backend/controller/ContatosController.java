package com.sp.backend.controller;

import java.util.List;

import com.sp.backend.model.Contatos;
import com.sp.backend.service.ContatosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/contatos")
@RestController
@CrossOrigin("*")

public class ContatosController {

    private ContatosService contatosService;

    public ContatosController(ContatosService contatosService) {
        this.contatosService = contatosService;
    }

    @GetMapping("/busca")
    public ResponseEntity<List<Contatos>> listacontatos() {
        return ResponseEntity.status(200).body(contatosService.listarcontatos());
    }

    @PostMapping("/envio")
    public ResponseEntity<Contatos> criaUsuario(@RequestBody Contatos contatos) {
        return ResponseEntity.status(201).body(contatosService.criarcontatos(contatos));
    }
}
