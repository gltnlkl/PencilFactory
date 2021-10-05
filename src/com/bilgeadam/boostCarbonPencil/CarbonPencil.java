package com.bilgeadam.boostCarbonPencil;

import com.bilgeadam.boostPencilTypes.Color;
import com.bilgeadam.boostPencilTypes.PencilTypes;

//sınıf özellikleri
//parametreli constructer
//parametresiz constructer
//toString
//getter and setter

public class CarbonPencil extends PencilTypes{

	//sınıf özellikleri
	
	private String carbonNo;

	//parametreli constructer
	
	public CarbonPencil(String model, double price, Color color, String carbonNo) {
		super(model, price, color);
		this.carbonNo = carbonNo;
	}
	
	//parametresiz constructer
	
	public CarbonPencil() {
		
	}

	//toString
	
	@Override
	public String toString() {
		return "CarbonPencil [model=" + getModel() + ", price=" + getPrice() +"TL"+ ", color=" + color
				+ ", carbonNo=" + carbonNo + "]";
	}

	//getter and setter
	
	public String getCarbonNo() {
		return carbonNo;
	}

	public void setCarbonNo(String carbonNo) {
		this.carbonNo = carbonNo;
	}

	
	
	
	
}
