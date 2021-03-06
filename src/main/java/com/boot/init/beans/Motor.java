package com.boot.init.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {
	@Value("${id}")
	private int id;

	@Autowired
	private FuelTank fuelTank;

	@Override
	public String toString() {
		return "Motor [id=" + id + ", fuelTank=" + fuelTank + "]";
	}

}
