package com.intensivospring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivospring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
