package com.lab.lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lab.lab1.domain.Player;
import com.lab.lab1.domain.Team;
import com.lab.lab1.repository.TeamRepository;

@SpringBootApplication
public class Lab1Application {

	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> teams = new ArrayList<Team>();

		Team team1 = new Team();
		team1.setName("Real Madrid");
		team1.setSlogan("Eagle");
		
		Set<Player> team1Players = new HashSet<Player>();
		Player player1 = new Player("Ronaldo", "Playmaker");
		Player player2 = new Player("Benzema", "Stricker");
		team1Players.add(player1);
		team1Players.add(player2);
		
		team1.setPlayers(team1Players);
		

		Team team2 = new Team();
		team2.setName("AS Roma");
		team2.setSlogan("ball");
		
		Set<Player> team2Players = new HashSet<Player>();
		Player player3 = new Player("Totti", "Sticker");
		Player player4 = new Player("M. Salah", "Stricker");
		team2Players.add(player3);
		team2Players.add(player4);
		
		team2.setPlayers(team2Players);

		teams.add(team1);
		teams.add(team2);

		teamRepository.save(teams);
	}
}
