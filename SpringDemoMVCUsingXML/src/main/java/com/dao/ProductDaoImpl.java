package com.dao;
import com.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class ProductDaoImpl implements ProductDaoInterface 
{
    @Autowired
	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) 
	{
		this.jt = jt;
	}
	@Override
	public int saveProduct(Product p) 
	{
     String query="insert into products11 values('"+p.getPid()+"','"+p.getPname()+"','"+
	 			    p.getPqty()+"','"+p.getPprice()+"')"; 
     return jt.update(query);
    }
	@Override
	public int updateProduct(Product p) 
	{
	  String query="update products11 set pname='"+p.getPname()+"',pqty='"+
	  p.getPqty()+"',pprice='"+p.getPprice()+"' where pid='"+p.getPid()+"'";
	  return jt.update(query);
	}
	@Override
	public int deleteProduct(Product p) 
	{
		String query="delete from products11 where pid="+p.getPid();
		return jt.update(query);
	}
    @Override
	public void showProductById(int pid) 
	{
       String query="select pid,pname,pqty,pprice from products11 where pid=?";
       Product p=(Product)jt.queryForObject(query, new RowMapper<Product>() 
       {
    	 @Override
	     public Product mapRow(ResultSet rs, int cnt) throws SQLException  
	     {
             Product  p = new Product();	 
    	     p.setPid(rs.getInt(1));
	         p.setPname(rs.getString(2));
	         p.setPqty(rs.getInt(3));
	         p.setPprice(rs.getInt(4));
      	     return p;
	     }
       }
      ,pid);
     if(p!=null)
      p.display();
    }
	@Override
	public ArrayList<Product> showAllProduct() 
	{
	  String query="select * from products";
	  ArrayList <Product> plist=(ArrayList<Product>) jt.query(query,new RowMapperImpl() );
	  //Display
	  Iterator<Product> it=plist.iterator();
	  while(it.hasNext())
	  {
		  Product p=it.next();
		  p.display();
	  }
	  return plist;
	}
}//end class










