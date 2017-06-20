package com.lab.lab2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

	@Value("${lucky-word}")
	String luckyWord;
	
	@Value("${Rabbit's Foot}")
	String rabbitFoot;

	@RequestMapping("/luckyWord")
	public String showLuckyWord() {
		return "The lucky word is: " + luckyWord;
	}
	
	@RequestMapping("/rabbit-foot")
	public String showFoot() {
		return "The Rabbit's Foot is: " + rabbitFoot;
	}

}
