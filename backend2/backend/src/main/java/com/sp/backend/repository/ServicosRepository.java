package com.sp.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.backend.model.Servicos;

@Repository
public interface ServicosRepository extends JpaRepository<Servicos, Long> {

}
