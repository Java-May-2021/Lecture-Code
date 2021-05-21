package com.matthew.gold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {
	
//	@RequestMapping(value="/", method=RequestMethod.GET)
	@GetMapping("/")
	public String gold(HttpSession session, Model viewModel) {
		ArrayList<String> activity = new ArrayList<String>();
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if(session.getAttribute("activity") == null) {
			session.setAttribute("activity",  activity);
		}
		
		viewModel.addAttribute("gold", session.getAttribute("gold"));
		viewModel.addAttribute("activity", session.getAttribute("activity"));
		return "index.jsp";
	}
	
//	@RequestMapping(value="/addGold", method=RequestMethod.POST)
	@PostMapping("/addGold")
	private String earnGold(HttpSession session, @RequestParam("building") String building) {
		Random r = new Random();
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY h:mma");
		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("activity");
		int gold = (int)session.getAttribute("gold");
		int goldThisTurn;
		if(building.equals("farm")) {
			// do farm stuff
			goldThisTurn = r.nextInt((20-10) + 1) + 10;
			activity.add(String.format("You entered a %s and earned %s gold %s \n", building, goldThisTurn, now));
		} else if(building.equals("cave")) {
			System.out.println("got here from cave!");
			goldThisTurn = r.nextInt((10-5) + 1) + 5;
			activity.add(String.format("You entered a %s and earned %s gold %s \n", building, goldThisTurn, now));
			// do cave stuff
		} else if(building.equals("house")) {			
			// do house stuff
			goldThisTurn = r.nextInt((5-2) + 1) + 2;
			activity.add(String.format("You entered a %s and earned %s gold %s \n", building, goldThisTurn, now));
		} else {
			// do casino stuff
			goldThisTurn = r.nextInt((50 + 50) + 1) - 50;
			if(goldThisTurn > 0) {
			activity.add(String.format("You entered a %s and earned %s gold %s \n", building, goldThisTurn, now));
			} else {
				activity.add(String.format("You entered a %s and lost %s gold ouch %s \n", building, goldThisTurn, now));
			}
			}
		int totalGold = gold += goldThisTurn;
		session.setAttribute("gold", totalGold);
		session.setAttribute("activity", activity);
		return "redirect:/";
	}
}
