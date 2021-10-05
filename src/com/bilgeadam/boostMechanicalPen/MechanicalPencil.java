package com.bilgeadam.boostMechanicalPen;

import com.bilgeadam.boostPencilTypes.Color;
import com.bilgeadam.boostPencilTypes.PencilTypes;   

//sınıf özellikleri
//parametreli constructer
//parametresiz constructer
//toString
//getter and setter

public class MechanicalPencil extends PencilTypes{

	//sınıf özellikleri
	
	private double sizeOfLead;

	//parametreli constructer

	public MechanicalPencil(String model, double price, Color color, double sizeOfLead) {
		super(model, price, color);
		this.sizeOfLead = sizeOfLead;
	}
	
	//parametresiz constructer
	
	public MechanicalPencil() {
		this.sizeOfLead =0.00;
	}

	//toString
	
	@Override
	public String toString() {
		return "MechanicalPencil [model=" + getModel() + ", price=" + getPrice() +"TL"+ ", color=" + color
				+ ", sizeOfLead=" + sizeOfLead + "]";
	}
	
	//getter and setter
	
	public double getSizeOfLead() {
		return sizeOfLead;
	}

	public void setSizeOfLead(double sizeOfLead) {
		this.sizeOfLead = sizeOfLead;
	}	
}
