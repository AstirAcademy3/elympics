package com.elympics.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.elympics.bean.CountryMeds;

public class CountryMedsDAO {
	
	public List<CountryMeds>getcountryMeds() throws NumberFormatException, IOException {
		List<CountryMeds> countryList= new ArrayList<CountryMeds>();
		CountryMeds country =new CountryMeds();
	    List<String> englishList = new ArrayList<String>();
	    BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Filippo\\Desktop\\file.txt"));
	    String line;
	      while((line = in.readLine())!=null){
	          String[] pair = line.split(",");
	          country.setCountry(pair[0]);
	          country.setGold_medals(Integer.parseInt(pair[1]));
	          country.setSilver_medals(Integer.parseInt(pair[2]));
	          country.setBronze_medals(Integer.parseInt(pair[3]));
	          countryList.add(country);
	      }
		return countryList;
	}

}
