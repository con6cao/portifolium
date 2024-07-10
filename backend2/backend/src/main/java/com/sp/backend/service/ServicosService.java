package com.sp.backend.service;

import com.sp.backend.model.Servicos;
import com.sp.backend.repository.ServicosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosService {

    private ServicosRepository servicosRepository;

    public ServicosService(ServicosRepository servicosRepository) {
        this.servicosRepository = servicosRepository;
    }

    public List<Servicos> listarServicos() {
        List<Servicos> listar = servicosRepository.findAll();
        return listar;
    }

    public Servicos criarServicos(Servicos servicos) {
        Servicos salva = servicosRepository.save(servicos);
        return salva;
    }
}
