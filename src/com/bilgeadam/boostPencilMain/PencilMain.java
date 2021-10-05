package com.bilgeadam.boostPencilMain;

import java.util.Scanner;

import com.bilgeadam.boostBallPointPen.BallPointPen;
import com.bilgeadam.boostCarbonPencil.CarbonPencil;
import com.bilgeadam.boostFountainPen.FountainPen;
import com.bilgeadam.boostFountainPen.Material;
import com.bilgeadam.boostMechanicalPen.MechanicalPencil;
import com.bilgeadam.boostPencilTypes.Color;

public class PencilMain {
	

	public static void main(String[] args) {
		// parametre gırılerek elde edılen sonuc; 
		MechanicalPencil mechanicalPencil= new MechanicalPencil("Versatil Kalem",150.0, Color.RED , 0.7);
		System.out.println(mechanicalPencil);
		
		FountainPen fountainPen = new FountainPen("Dolma Kalem", 2000.0, Color.BLACK, Material.GOLDEN);  
		System.out.println(fountainPen);
		
		CarbonPencil carbonPencil = new CarbonPencil("Kurşun Kalem", 5.0 , Color.BLUE, "2B");
		System.out.println(carbonPencil);
		
		BallPointPen ballPointPen = new BallPointPen("Tükenmez Kalem", 10.0, Color.GREEN, false);
		System.out.println(ballPointPen+"\r");
		
		// dısarıdan verı alınarak elde edılen sonuc; 
		Scanner input= new Scanner (System.in);
		System.out.println("Lütfen belirtilen kalem modellerden birini giriniz: \r \n- Versatil Kalem \n- Dolma Kalem \n- Kurşun Kalem \n- Tükenmez Kalem. ");
		String modelInput = input.nextLine();
		
		
		boolean result = true; 
		
		do { switch(modelInput) {
		case("Versatil Kalem"): {
			

			System.out.println("Lütfen fiyat giriniz.");
			double price=input.nextDouble();
//  ? 		System.out.println("Lütfen belirtilen renklerden birini giriniz: \n- BLACK \n- RED \n- GREEN \n- BLUE");
//			String color=input.nextLine();
			System.out.println("Lütfen kalem uç değerini giriniz.");
			double sizeOfLead=input.nextDouble();
			
			MechanicalPencil mechanicalPencilOut= new MechanicalPencil("Versatil Kalem",price, Color.BLACK , sizeOfLead);  
			System.out.println(mechanicalPencilOut);
			
			break;
		}	
		case("Dolma Kalem"): {
			System.out.println("Lütfen fiyat giriniz.");
			double price=input.nextDouble();

			
			
			FountainPen fountainPenOut = new FountainPen("Dolma Kalem", price, Color.BLACK, Material.GOLDEN);  
			System.out.println(fountainPenOut);
			break;
		}
		case("Kurşun Kalem"): {
			System.out.println("Lütfen fiyat giriniz.");
			double price=input.nextDouble();
			System.out.println("Lütfen No giriniz.");
			String carbonNo=input.nextLine();
			
			
			CarbonPencil carbonPencilOut = new CarbonPencil("Kurşun Kalem", price , Color.BLUE, carbonNo);
			System.out.println(carbonPencilOut);
			break;
		}
		case("Tükenmez Kalem"): {
			System.out.println("Lütfen fiyat giriniz.");
			double price=input.nextDouble();
			System.out.println("Lütfen kapak durumunu true - false şeklinde giriniz.");
			boolean penCap=input.nextBoolean();
			
			
			BallPointPen ballPointPenOut = new BallPointPen("Tükenmez Kalem", price, Color.GREEN, penCap);
			System.out.println(ballPointPenOut+"\r");
			
			break;
		}
		default:  
			System.out.println("Lütfen doğru bir değer giriniz.");
			result=false; 
		} 
		}

		while (result==true);	
		
		input.close();
		}
	}
