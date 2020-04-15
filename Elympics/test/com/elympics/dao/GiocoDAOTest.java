package com.elympics.dao;

import java.util.List;

import com.elympics.bean.Gioco;
import com.elympics.bean.Partita;
import com.elympics.bean.RigaClassifica;

public class GiocoDAOTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiocoDAO dao= new GiocoHBDAO();

		try {
			List <Gioco> result=dao.getAll();
			System.out.println("Giochi trovati" + result.size());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
