package com.sp.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.backend.model.Projetos;

@Repository
public interface ProjetosRepository extends JpaRepository<Projetos, Long> {

}
