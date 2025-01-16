package com.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.Model.Product;
@Component("pdao")
public class ProductDaoIMPL implements ProductDaoInterface
{

	@Autowired
	JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	
	@Override
	public int saveProduct(Product p) 
	{
		String query="insert into Product1 values('"+p.getPid()+"','"+p.getPname()+"','"+p.getPqnty()+"','"+p.getPrice()+"')";
		
		return jt.update(query);
	}

	@Override
	public int updateProduct(Product p) 
	{ 
		String query="update product1 set pname='"+p.getPname()+"',pqnty='"+p.getPqnty()+"',price='"+p.getPrice()+"' where pid='"+p.getPid()+"'";
		return jt.update(query);
	}

	@Override
	public int deleteProduct(Product p) 
	{
		String query="delete from product1 where pid="+p.getPid();
		return jt.update(query);
	}

	@Override
	public void showProductById(int pid)
	{
		 String query="Select  pid,pname,pqnty,price from product1  where pid=?";
		 
		 Product p = jt.queryForObject(query, new RowMapper<Product>()
		{
			@Override
			public Product mapRow(ResultSet rs, int cnt) throws SQLException 
			{
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPqnty(rs.getInt(3));
				p.setPrice(rs.getInt(4));
				return p;
			}
			
		}
		 ,pid);
		 p.display();
		
	}

	@Override
	public void showProduct() 
	{
		 String query="Select * from product1";
		 ArrayList <Product> plist = (ArrayList<Product>) jt.query(query, new RowMapperIMPL());
		 Iterator<Product> it = plist.iterator();
		 while (it.hasNext())
		 {
			Product p = it.next();
			p.display();
			
		}
	}
	
}
