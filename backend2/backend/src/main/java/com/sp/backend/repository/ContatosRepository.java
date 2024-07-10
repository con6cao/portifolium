package com.sp.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.backend.model.Contatos;

@Repository
public interface ContatosRepository extends JpaRepository<Contatos, Long> {

}
