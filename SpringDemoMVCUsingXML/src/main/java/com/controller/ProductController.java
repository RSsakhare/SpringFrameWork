package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dao.*;
import com.model.*;
import java.util.*; 
@Controller
public class ProductController 
{
	@Autowired
    ProductDaoImpl pdao;
	
	public void setPdao(ProductDaoImpl pdao) 
	{
		this.pdao = pdao;
	}
	
	@RequestMapping("showprod")
	public String getShowProductPage(Model m) {
	    ArrayList<Product> plist = pdao.showAllProduct();   
	    m.addAttribute("plist", plist);  // This is fine
	    System.out.println(plist);  // Log the product list to check its contents
	    return "showprod";  // Ensure you return the correct JSP name
	}

	
	
}
