package com.lab.lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lab.lab1.domain.Team;
import com.lab.lab1.repository.TeamRepository;

//@RestController
public class TeamController {
	
	@Autowired
	private TeamRepository teamRepository;

	@RequestMapping("/teams")
	public Iterable<Team> getTeams(){
		return teamRepository.findAll();
	}
	
	@RequestMapping("/teams/{id}")
	public Team getTeam(@PathVariable long id){
		return teamRepository.findOne(id);
	}
}
