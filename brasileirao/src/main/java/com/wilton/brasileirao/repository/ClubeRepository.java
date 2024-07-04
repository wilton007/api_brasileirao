package com.wilton.brasileirao.repository;

import com.wilton.brasileirao.model.Clube;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubeRepository extends JpaRepository<Clube,Long> {
}
