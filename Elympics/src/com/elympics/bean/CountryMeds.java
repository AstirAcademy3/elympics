package com.elympics.bean;

public class CountryMeds {
	
	private String country;
	private Integer gold_medals;
	private Integer silver_medals;
	private Integer bronze_medals;
	private Integer tot_meds;
	private Integer tot_points;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getGold_medals() {
		return gold_medals;
	}
	public void setGold_medals(Integer gold_medals) {
		this.gold_medals = gold_medals;
	}
	public Integer getSilver_medals() {
		return silver_medals;
	}
	public void setSilver_medals(Integer silver_medals) {
		this.silver_medals = silver_medals;
	}
	public Integer getBronze_medals() {
		return bronze_medals;
	}
	public void setBronze_medals(Integer bronze_medals) {
		this.bronze_medals = bronze_medals;
	}
	public Integer getTot_meds() {
		return tot_meds;
	}
	public void setTot_meds() {
		this.tot_meds = this.gold_medals+this.silver_medals+this.bronze_medals;
	}
	public Integer getTot_points() {
		return tot_points;
	}
	public void setTot_points() {
		this.tot_points = (this.gold_medals*3)+(this.silver_medals*3)+this.bronze_medals;
	}
	
	public CountryMeds(String country, Integer gold_medals, Integer silver_medals, Integer bronze_medals) {
		super();
		this.country = country;
		this.gold_medals = gold_medals;
		this.silver_medals = silver_medals;
		this.bronze_medals = bronze_medals;
	}
	public CountryMeds() {
		super();
	}
	public CountryMeds(String country, Integer gold_medals, Integer silver_medals, Integer bronze_medals,
			Integer tot_meds, Integer tot_points) {
		super();
		this.country = country;
		this.gold_medals = gold_medals;
		this.silver_medals = silver_medals;
		this.bronze_medals = bronze_medals;
		this.tot_meds = tot_meds;
		this.tot_points = tot_points;
	}
	@Override
	public String toString() {
		return "country=" + country + ", gold medals=" + gold_medals + ", silver medals=" + silver_medals
				+ ", bronze_+ medals=" + bronze_medals + ", total medals=" + tot_meds + ", total points=" + tot_points;
	}
	

}
