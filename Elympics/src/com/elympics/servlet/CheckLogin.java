package com.elympics.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elympics.dao.*;
import com.elympics.bean.User;
import com.elympics.manager.UserManager;


@WebServlet ("/checklogin" )
public class CheckLogin extends HttpServlet

{
	
	private static final long serialVersionUID = 1L;

	int contatore = 0; 
	int numeroTentativi = 0; 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		UserDAO dao = new UserHBDAO();
		User user=null;
		try {
			user = dao.login(username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user!=null){
			request.getSession().setAttribute("User", user);
			System.out.println("accesso garantito");
			response.sendRedirect("home.jsp");
		}else {
			PrintWriter w = response.getWriter();
			w.append("<p>Utente o Password errati, ritentare</p>");
			w.append("<a href=loginCss.jsp>torna al login</a>");
			
		}
		}	
	}

