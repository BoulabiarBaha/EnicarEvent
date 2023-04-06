package com.example.enicarevent.repository;

import com.example.enicarevent.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Evenement,Integer> {
}
