package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		Point p03 = new Point(113,115);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		
		
		
		
		
		
		
		
	}
}
