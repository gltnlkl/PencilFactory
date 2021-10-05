package com.bilgeadam.boostPencilTypes;

//sınıf özellikleri
//parametreli constructer
//parametresiz constructer
//toString
//getter and setter

public class PencilTypes {

	//sınıf özellikleri
	
	private String model;
	private double price;
	protected Color color;
	
	//parametreli constructer
	
	public PencilTypes(String model, double price, Color color) {
		super();
		this.model = model;
		this.price = price;
		this.color = color;
	}
	 
	//parametresiz constructer     // enum a ılk deger atayamıyor muyum
	
	public PencilTypes() {   
		this.model = "";
		this.price = 0.0;   
		
	}
	
	//toString
	
	@Override
	public String toString() {
		return "PencilTypes [model=" + model + ", price=" + price + ", color=" + color + "]";
	}

	//getter and setter
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
