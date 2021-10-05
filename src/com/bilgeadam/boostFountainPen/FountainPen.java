package com.bilgeadam.boostFountainPen;

import com.bilgeadam.boostPencilTypes.Color;
import com.bilgeadam.boostPencilTypes.PencilTypes;

//sınıf özellikleri
//parametreli constructer
//parametresiz constructer
//toString
//getter and setter

public class FountainPen extends PencilTypes{
	
	//sınıf özellikleri
	
	private Material material;

	//parametreli constructer
	
	public FountainPen(String model, double price, Color color, Material material) {
		super(model, price, color);
		this.material = material;
	}
	
	//parametresiz constructer
	
	public FountainPen() {
		
	}

	//toString
	
	@Override
	public String toString() {
		return "FountainPen [model=" + getModel() + ", price=" + getPrice() +"TL"+ ", color=" + color
				+ ", material=" + material + "]";
	}

	
}
