package com.example.limitsservice.controller;

public class Limits {
	private int maximum;
	private int minimum;
	Limits() {
		super();
		
	}
	public Limits(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	@Override
	public String toString() {
		return "Limits [maximum=" + maximum + ", minimum=" + minimum + "]";
	}
}
