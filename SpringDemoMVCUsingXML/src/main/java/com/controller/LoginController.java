package com.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*

mav.setViewName("exampleView");
mav.addObject("message", "Hello, this is a message from the controller!");
return mav;
*/
@Controller
public class LoginController 
{
	    @RequestMapping("/userpage")
	    public ModelAndView getUserPage(HttpServletRequest request) 
	    {
	    	ModelAndView mav = new ModelAndView();
	        // Get username and password from request parameters
	        String uname = request.getParameter("uname");
	        String upwd = request.getParameter("upwd");

	        // Validate username and password
	        if (uname == null || uname.isEmpty() || upwd == null || upwd.isEmpty()) {
	            //m.addAttribute("msg", "Username or password cannot be empty");
	            mav.setViewName("login");
	            mav.addObject("msg", "Username or password cannot be empty");
	            return mav; // Return to login page
	        }

	        // Hardcoded login validation (use a database or service in a real app)
	        if ("admin".equals(uname) && "admin123".equals(upwd)) {
	        	mav.setViewName("userpage");
	            mav.addObject("msg", "Welcome, admin!");
	            return mav; // Redirect to user page if credentials are valid
	        }

	        // Invalid credentials message
	        mav.setViewName("login");
	        mav.addObject("msg", "Invalid username or password");
	        return mav; // Return to login page on failure
	    }
}
