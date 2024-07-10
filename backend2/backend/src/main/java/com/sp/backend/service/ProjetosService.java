package com.sp.backend.service;

import com.sp.backend.model.Projetos;
import com.sp.backend.repository.ProjetosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetosService {

    private ProjetosRepository projetosRepository;

    public ProjetosService(ProjetosRepository projetosRepository) {
        this.projetosRepository = projetosRepository;
    }

    public List<Projetos> listarProjetos() {
        List<Projetos> listar = projetosRepository.findAll();
        return listar;
    }

    public Projetos criarProjetos(Projetos projetos) {
        Projetos salva = projetosRepository.save(projetos);
        return salva;
    }
}