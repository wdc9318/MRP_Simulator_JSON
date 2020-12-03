package com.tristar.mrpsimulator;

import java.util.Random;




public class Cost {
	
	private final String part;
	private String cost_received = "0";
	private String cost_labor = "0";
	private String cost_final = "0";
	
	/**
	 * @param part
	 */
	public Cost(String part) {
		this.part = part;
		this.getRandomCost();
	}

	private void getRandomCost()
	{
		Integer cents_receieved = this.getRandomNumber(0,99);
		Integer dollars_received = this.getRandomNumber(0, 50);
		
		this.cost_received = dollars_received + "." + cents_receieved;
		
		Integer cents_labor = this.getRandomNumber(0,99);
		Integer dollars_labor = this.getRandomNumber(0, 50);
		
		this.cost_labor = dollars_labor + "." + cents_labor;
		
		Integer cents_fin = cents_receieved + cents_labor;
		Integer dollars_fin = 0;
		
		if(cents_fin > 100)
		{
			dollars_fin = dollars_fin + 1;
			cents_fin = cents_fin - 100;
		}
		
		dollars_fin = dollars_fin + dollars_received + dollars_labor;
		this.cost_final = dollars_fin + "." + cents_fin;

	}
	
	public String getPart() {
		return part;
	}

	public String getCost_received() {
		return cost_received;
	}

	public String getCost_labor() {
		return cost_labor;
	}

	public String getCost_final() {
		return cost_final;
	}

	private Integer getRandomNumber(int min, int max)
	{
		Random r = new Random();
		Integer i = r.nextInt((max-min) +1) + min;
		return i;
	}
}
