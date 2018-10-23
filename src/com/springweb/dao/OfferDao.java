package com.springweb.dao;

import java.util.List;

import com.springweb.model.Offer;

public interface OfferDao {
	public List<Offer> getOffers();

	public boolean update(Offer offer);

	public boolean create(Offer offer);

	public boolean delete(int id);

	public Offer getOffer(int id);
}
