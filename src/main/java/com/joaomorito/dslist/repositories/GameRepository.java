package com.joaomorito.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomorito.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
