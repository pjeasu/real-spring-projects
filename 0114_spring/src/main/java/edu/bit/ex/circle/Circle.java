package edu.bit.ex.circle;

public class Circle {
	private double radius;

	public double getArea() {
		return 2 *radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


}

