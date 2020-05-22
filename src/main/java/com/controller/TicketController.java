package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Ticket;
import com.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@RequestMapping(value = "/showpage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("ticket") Ticket ticket) {

		return "showpage";
	}

	@RequestMapping(value = "/calculateCost", method = RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("ticket") Ticket ticket, ModelMap model, BindingResult result) {


		double cost = ticketService.calculateTotalCost(ticket);

		model.addAttribute("cost", "Your total cost is Rs." + cost + "/- ");
		System.out.println("cost is " + cost);

		return "result";

	}

	@ModelAttribute("circleList")
	public Map<String, String> buildState() {
		Map<String, String> map = new HashMap<String, String>();

		map.put("King", "King");
		map.put("Queen", "Queen");

		return map;

	}
}