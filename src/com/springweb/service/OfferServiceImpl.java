package com.springweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.dao.OfferDaoImpl;
import com.springweb.model.Offer;
@Service
public class OfferServiceImpl implements OfferService {
	
public OfferServiceImpl() {
	System.out.println("ServiceImpl successfully load");
	}

private OfferDaoImpl offerDao;
@Autowired
	public void setOfferDao(OfferDaoImpl offerDao) {
	this.offerDao = offerDao;
}

	@Override
	public List<Offer> getOffers() {
		return offerDao.getOffers();
	}

	@Override
	public void update(Offer offer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void create(Offer offer) {
		offerDao.create(offer);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Offer getOffer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
