package com.example.enicarevent.repository;

import com.example.enicarevent.model.Spectateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpectateursRepository extends JpaRepository<Spectateurs,Integer> {

    List<Spectateurs> getSpectateursByidevenement(int idevenement);
}
