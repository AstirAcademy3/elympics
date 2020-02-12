package com.elympics.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public AddUser() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String surn = request.getParameter("surname");
		String user = request.getParameter("username");
		String mail = request.getParameter("email");
		String pass = request.getParameter("password");
		String conf_pass = request.getParameter("confPass");
		Date birth=null;
		try {
			 birth = new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("birth"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String country = request.getParameter("country");
		String sex = request.getParameter("sex");
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("surname"));
		System.out.println(request.getParameter("username"));
		System.out.println( request.getParameter("email"));
		System.out.println(request.getParameter("password"));
		System.out.println(request.getParameter("confPass"));
		System.out.println(request.getParameter("birth"));
		System.out.println(request.getParameter("sex"));
		System.out.println(request.getParameter("country"));
		
		PrintWriter w= response.getWriter();
		w.append("<p>name: "+name+"</p> ");
		w.append("<p>surname: "+surn+"</p> ");
		w.append("<p>user: "+user+"</p> ");
		w.append("<p>mail: "+mail+"</p> ");
		w.append("<p>pass: "+pass+"</p> ");
		w.append("<p>conf_pass: "+conf_pass+"</p> ");
		w.append("<p>birth: "+birth+"</p> ");
		w.append("<p>gender: "+sex+"</p> ");
		
	}

}
