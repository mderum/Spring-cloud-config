package com.example.limitsservice.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int maximum;
	private int minimum;
//	Configuration() {
//		super();
//		
//	}
//	public Configuration(int maximum, int minimum) {
//		super();
//		this.maximum = maximum;
//		this.minimum = minimum;
//	}

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
