package com.elympics.servlet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elympics.bean.CountryMeds;
import com.elympics.dao.CountryMedsDAO;


@WebServlet("/RanksData")
public class RanksData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CountryMedsDAO c= new CountryMedsDAO();
		List<CountryMeds> score_board=c.getcountryMeds();
		BufferedWriter outputWriter = null;
		  outputWriter = new BufferedWriter(new FileWriter("C:\\Users\\Filippo\\Desktop\\prova.txt"));
		  for (int i = 0; i < score_board.size(); i++) {
			  score_board.get(i).setTot_meds();
			  score_board.get(i).setTot_meds();
		    outputWriter.write(score_board.get(i).toString());
		    outputWriter.newLine();
		  }
		  outputWriter.flush();  
		  outputWriter.close();  
	}
}
