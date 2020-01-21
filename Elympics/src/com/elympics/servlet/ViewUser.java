package com.elympics.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;


@WebServlet("/ViewUser")
public class ViewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User u = (User) request.getSession().getAttribute("utente");
		response.setContentType("text/html; charset= UTF-8");
		PrintWriter w= response.getWriter();
		 w.append("<b>Profilo Utente</p>");
		 
		 if(u != null) {
			 
			 w.append("<table border=\"1\" style=\" background-color:red;\" > ");
			 w.append("<tr><td>Username</td>" + "<td>" + u.getUsername() +"</td>"); 
			 w.append("<tr><td>Nome</td>"+ "<td>" + u.getName()+ "</td>"); 
			 w.append("<tr><td>Cognome</td>"+ "<td>"+ u.getFullName()+ "</td>"); 
			 w.append("</table>");
			 
			 w.append("<a href=\"http://" + request.getLocalAddr() +":8080/" + request.getContextPath() + "/checklogin\">logout</a>");
			 		
			 		
			 		
		 } else {
			 w.append("<p>Utente non in sessione, si prega di effettuare il login</p>");
			 w.append("\"<a href=\\\"http://\" + request.getLocalAddr() +\":8080/\" + request.getContextPath() + \"/checklogin\\\">login</a>");
		 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
