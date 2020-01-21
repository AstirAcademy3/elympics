package com.elympics.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elympics.bean.User;
import com.elympics.manager.UserManager;


@WebServlet ("/checklogin" )
public class CheckLogin extends HttpServlet

{
	
	private static final long serialVersionUID = 1L;
	
	/*int contatore = 0;
	int numeroTentativi = 0;*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserManager manager= new UserManager();
		User u = manager.getUser(username,password);
		PrintWriter w = response.getWriter();
		if (u==null) 
		{
		
		response.setContentType("text/html; charset=UTF-8");
		
			w.append("<b>Inserire nuovamente login e password!</p>");
			request.getSession().setAttribute("user", null);	
		}else  
			{
			
		w.append("<b>Login</p>");
		w.append("<table border=\"1\" style=\"background-color:red;\">");
		
    String s="";
    
	Enumeration<String> enums = request.getHeaderNames();
	
		String name = enums.nextElement();
		while(name!=null)
		{
			s = "<tr style=\"width:50%;\">"
					+ "<td> Header:" + name + "</td>"
					+ "<td>" + request.getHeader(name) + "</td>"
					+"</tr>";
			w.append(s);
			name = enums.nextElement();
		}
		w.append("<tr><td>ContextPath:</td>" + "<td>" + request.getContextPath()+ "</td>");
		w.append("<tr><td>LocalAdress:</td>" + "<td>" + request.getLocalAddr()+ "</td>");
		w.append("<tr><td>LocalName:</td>" + "<td>" + request.getLocalName()+ "</td>");
		w.append("<tr><td>LocalPort:</td>" + "<td>" + request.getLocalPort()+ "</td>");
		w.append("<tr><td>Method(GET/POST):</td>" + "<td>" + request.getMethod()+ "</td>");
		w.append("<tr><td>username:</td>" + "<td>" + username+ "</td>");
		w.append("<tr><td>password:</td>" + "<td>" + password+ "</td>");
		w.append("<tr><td>nome:</td>" + "<td>" + u.getNome()+ "</td>");
		w.append("<tr><td>cognome:</td>" + "<td>" + u.getCognome()+ "</td>");
		
		
		w.append("</table>");
		 
		w.append("<a href=\"http://" + request.getLocalAddr() +":8080/" + request.getContextPath() + "/view\">vedi profilo</a>");
		u.setUsername(username);
		request.getSession().setAttribute("user", u);	
		
		}
		}
		
		
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter w = res.getWriter();
		res.setContentType("text/html; charset=UTF-8");		
		w.append("<p>Sei passato dalla post</p>");
		doGet(req, res);
	}
	}

