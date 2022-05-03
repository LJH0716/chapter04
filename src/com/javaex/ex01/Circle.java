package com.javaex.ex01;

public class Circle {

	// 필드
	private int radius;

	//생성자
	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle() {

	}

	// 메소드 getter/setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
		
	}

}
