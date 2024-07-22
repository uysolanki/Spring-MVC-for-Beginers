package com.excelr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.excelr.model.Player;

@Controller
public class MyController {
	List<Player> players=new ArrayList();
	//@RequestMapping("/greet")
	@RequestMapping(value={"/","/hello","/index","/greet"})
	public String greet(@ModelAttribute Player filledPlayerObject, Model model)
	{
		//return "welcome";
		players.add(filledPlayerObject);
		model.addAttribute("players",players);
		return("showListOfPlayers");
	}
	@RequestMapping("/ceo")
	public String greetCeo(Model model)
	{					//	FrontEnd	BackEnd Data
		model.addAttribute("ceoName", "Azim Premji");
		return "welcomeceo";
	}
	
	@RequestMapping("/celebs")
	public String greetCeo(ModelMap modelmap)
	{					//	FrontEnd	BackEnd Data
		modelmap.addAttribute("ceoName", "Azim Premji");
		modelmap.addAttribute("actorName", "Shah Rukh Khan");
		modelmap.addAttribute("cricketerName", "Virat Kohli");
		return "welcomecelebs";
	}
	
	@RequestMapping("/worldCupTeam")
	public ModelAndView worldCupTeam()
	{					
		ModelAndView mav=new ModelAndView();
		mav.setViewName("welcomewct");
		mav.addObject("captain", "Rohit Sharma");
		mav.addObject("wicketkeeper", "Rishab Pant");
		mav.addObject("cricketerName", "Virat Kohli");
		return mav;
	}
	
	@RequestMapping("/objectsWelcomeWct")
	public ModelAndView objectsWelcomeWct()
	{
	ModelAndView mav=new ModelAndView();
	mav.setViewName("objectswelcomewct");
	mav.addObject("captain", new Player(45,"Rohit",6,300));
	mav.addObject("wicketkeeper", new Player(17,"Rishab Pant",6,250));
	mav.addObject("bowler", new Player(97,"JaspritBumrah",6,100));
	return mav;
	}
	
	@RequestMapping("/registerionForm")
	public String openRegisterationPlayerForm(Model model)
	{
		Player p=new Player();
		model.addAttribute("emptyPlayerObject",p);
		return("registerPlayer");
	}
	
	@RequestMapping("/registerNewPlayer")
	public String registerNewPlayer(@ModelAttribute Player filledPlayerObject, Model model)
	{
		model.addAttribute("filledPlayerObject",filledPlayerObject);
		return("registerSuccess");
	}
	
	
//	@RequestMapping("/listregisterNewPlayer")
//	public String registerNewPlayers(@ModelAttribute Player filledPlayerObject, Model model)
//	{
//		players.add(filledPlayerObject);
//		model.addAttribute("players",players);
//		return("showListOfPlayers");
//	}
}
