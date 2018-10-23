package com.springweb.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.model.User;

@Repository
public class UserDaoImpl {
	
	private DataSource dataSource;
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbc= new NamedParameterJdbcTemplate(dataSource);
	}

	@Transactional
	public boolean create(User user) {
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(user);
		String sql="insert into users(username,email,password,enabled)values(:username,:email,:password,:enabled)";
		String sql1="insert into authorities(username,authority)values(:username,:authority)";
	   jdbc.update(sql, param);
		return jdbc.update(sql1, param)==1;
		
	}

	public boolean exists(String username) {
		
		return  jdbc.queryForObject("select count(*)from users where username=:username",new MapSqlParameterSource("username",username),Integer.class)>0;
	}

	
}
