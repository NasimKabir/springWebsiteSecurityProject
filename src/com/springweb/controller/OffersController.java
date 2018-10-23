package com.springweb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springweb.model.Offer;
import com.springweb.service.OfferServiceImpl;

@Controller
public class OffersController {
	private OfferServiceImpl service;

	@Autowired
	public void setService(OfferServiceImpl service) {
		this.service = service;
	}

	@RequestMapping(value = "/list")
	public String list(Model model) {
		List<Offer> getlist = service.getOffers();
		model.addAttribute("table", getlist);
		return "offerList";
	}

	@RequestMapping(value = "/from", method = RequestMethod.GET)
	public String showfrom(Model model) {
		model.addAttribute("offerfrom", new Offer());
		return "offercreate";
	}

	@RequestMapping(value = "/created", method = RequestMethod.POST)
	public String createfrom(@Valid @ModelAttribute("offerfrom") Offer offer, BindingResult result) {
		if (result.hasErrors()) {
			return "offercreate";
		}
		service.create(offer);
		return "offercreated";
	}
}
