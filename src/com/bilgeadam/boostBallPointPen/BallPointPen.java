package com.bilgeadam.boostBallPointPen;

import com.bilgeadam.boostPencilTypes.Color;
import com.bilgeadam.boostPencilTypes.PencilTypes;

//sınıf özellikleri
//parametreli constructer
//parametresiz constructer
//toString
//getter and setter

public class BallPointPen extends PencilTypes{
	
	//sınıf özellikleri
	
	private boolean penCap;

	//parametreli constructer
	
	public BallPointPen(String model, double price, Color color, boolean penCap) {
		super(model, price, color);
		this.penCap = penCap;
	}
	
	//parametresiz constructer
	
	public BallPointPen() {
		
	}

	//toString
	

	@Override
	public String toString() {
		return "BallPointPen [model=" + getModel() + ", price=" + getPrice() +"TL"+ ", color=" + color
				+ ", penCap=" + penCap + "]";
	}


	//getter and setter
	
	public boolean isPenCap() {
		return penCap;
	}

	public void setPenCap(boolean penCap) {
		this.penCap = penCap;
	}
	
	
	
	
	
	
}
