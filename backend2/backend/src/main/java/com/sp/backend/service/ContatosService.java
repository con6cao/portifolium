package com.sp.backend.service;

import com.sp.backend.model.Contatos;
import com.sp.backend.repository.ContatosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatosService {

    private ContatosRepository contatosRepository;

    public ContatosService(ContatosRepository contatosRepository) {
        this.contatosRepository = contatosRepository;
    }

    public List<Contatos> listarcontatos() {
        List<Contatos> listar = contatosRepository.findAll();
        return listar;
    }

    public Contatos criarcontatos(Contatos contatos) {
        Contatos salva = contatosRepository.save(contatos);
        return salva;
    }
}
