package com.boot.init.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FuelTank {
	private String fuelType;
	private int capacity;

	@Value("${fuelType}")
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Value("${capacity}")
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "FuelTank [fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}

}
