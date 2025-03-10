package com.controller;



import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Dao.ProductDaoIMPL;
import com.Dao.ProductDaoInterface;

@Configurable
public class AppConfig 
{
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("hr");
		ds.setPassword("hr");
		return ds;
	}
	@Bean(name="jt")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate ref = new JdbcTemplate();
		ref.setDataSource(getDriverManagerDataSource());
		return ref;
		
	}
	
	@Bean(name="pdao")
	public ProductDaoInterface getProductDaoIMPL()
	{
		ProductDaoInterface pdao = new ProductDaoIMPL();
		return pdao;
		
	}

}
