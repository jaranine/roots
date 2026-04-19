package com.jaranine.roots.repository;

import com.jaranine.roots.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}