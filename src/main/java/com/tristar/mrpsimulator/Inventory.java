package com.tristar.mrpsimulator;

import java.util.Random;

public class Inventory {
	
	private final String part;
	private String plant1_SOO = "0";
	private String plant2_SOO = "0";
	private String plant1_SOH = "0";
	private String plant2_SOH = "0";

	/**
	 * @param part
	 */
	public Inventory(String part) {
		super();
		this.part = part;
		this.plant1_SOO = this.getRandomInventory(0, 50);
		this.plant2_SOO = this.getRandomInventory(0, 50);
		this.plant1_SOH = this.getRandomInventory(0, 50);
		this.plant2_SOH = this.getRandomInventory(0, 50);
	}
	
	private String getRandomInventory(int min, int max)
	{
		Random r = new Random();
		Integer i = r.nextInt((max-min) +1) + min;
		return i.toString();
	}
	
	public String getPart() {
		return part;
	}

	public String getPlant1_SOO() {
		return plant1_SOO;
	}

	public String getPlant2_SOO() {
		return plant2_SOO;
	}

	public String getPlant1_SOH() {
		return plant1_SOH;
	}

	public String getPlant2_SOH() {
		return plant2_SOH;
	}

	

}
