package com.gerenciador.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciador.gerenciador.model.gerenciador;

public interface GerenciadorRepository extends JpaRepository<gerenciador, Long>{
    gerenciador findById(long Id);    
 }
 public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}

public interface MembroRepository extends JpaRepository<membro, Long> {
}

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
