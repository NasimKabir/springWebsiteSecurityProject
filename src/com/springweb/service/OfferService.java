package com.springweb.service;

import java.util.List;

import com.springweb.model.Offer;

public interface OfferService {
	public List<Offer> getOffers();

	public void update(Offer offer);

	public void create(Offer offer);

	public void delete(int id);

	public Offer getOffer(int id);
}
