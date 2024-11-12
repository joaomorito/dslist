package com.joaomorito.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaomorito.dslist.dto.GameDTO;
import com.joaomorito.dslist.dto.GameMinDTO;
import com.joaomorito.dslist.entities.Game;
import com.joaomorito.dslist.repositories.GameRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
		}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
