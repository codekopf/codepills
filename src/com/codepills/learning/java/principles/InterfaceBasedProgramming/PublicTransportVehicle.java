package com.codepills.learning.java.principles.InterfaceBasedProgramming;

/** This is a simple example for explaining Interface Based Programming in Java
 * 
 */

interface TransportProperties {
	public void move();
}


class Vehicle {
	public void car(){
		System.out.println("This is car");
	}
	
	public void boat(){
		System.out.println("This is boat");
	}
	
	public void bus(){
		System.out.println("This is bus");
	}
}


public class PublicTransportVehicle extends Vehicle implements TransportProperties {
		
	public void car() {
		System.out.println("You choose car.");
	}
	
	public void car(String brand) {
		System.out.println("This car is " + brand + ".");
	}
	
	public void move() {
		System.out.println("This vehicle moves!");
	}	
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		PublicTransportVehicle car = new PublicTransportVehicle();
		Vehicle publicTransport = new PublicTransportVehicle();
		TransportProperties ibp = new PublicTransportVehicle();
		
		/** Try to guess the results before you run the program.
		 * 
		 */
		vehicle.car();
		car.car();
		car.car("FORD");
		publicTransport.car();
		ibp.move();
	}
}
