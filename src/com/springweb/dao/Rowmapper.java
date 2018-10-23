package com.springweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springweb.model.Offer;

public class Rowmapper implements RowMapper<Offer> {

	@Override
	public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Offer o=new Offer();
		o.setId(rs.getInt("id"));
		o.setName(rs.getString("name"));
		o.setEmail(rs.getString("email"));
		o.setText(rs.getString("text"));
		return o;
	}

}
