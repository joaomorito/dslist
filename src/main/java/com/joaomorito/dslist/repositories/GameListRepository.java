package com.joaomorito.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaomorito.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
