package com.springweb.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springweb.model.Offer;
@Repository
public class OfferDaoImpl implements OfferDao {
	
	public OfferDaoImpl() {
		System.out.println("DaoImpl successfully load");
	}

	private DataSource dataSource;
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Offer> getOffers() {
		String sql = "select * from offer";
		return jdbc.query(sql, new Rowmapper());
	}

	@Override
	public boolean update(Offer offer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create(Offer offer) {
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(offer);
		String sql = "insert into offer(name,email,text)values(:name,:email,:text)";
		return jdbc.update(sql, param) == 1;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Offer getOffer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
