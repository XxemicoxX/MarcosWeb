package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Tienda;

@Repository
public interface TiendaRepository extends JpaRepository<Tienda, Long>{
    
}
