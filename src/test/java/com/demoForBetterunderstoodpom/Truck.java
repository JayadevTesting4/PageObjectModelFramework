package com.demoForBetterunderstoodpom;

public class Truck extends CommonVehicleFunctions{

	Engine engine;
	String loadCapacity;

	Truck(Engine e){
		super(e);
		this.engine = e;
	}
}