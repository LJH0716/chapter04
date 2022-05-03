package com.javaex.ex01;

public class PointList {
	
	//필드
	private Point[] pArray;
	private int crtPos; //다음에 추가해줄 방 번호
	
	//생성자
	public PointList() {
		//배열 3개 --> 원래는 만들지 않음
		pArray = new Point[3];
		crtPos = 0;
	}
	
	//메소드 getter/setter
	
	//메소드 일반
	public void add(Point point) {
		//현재 배열 갯수+1
		//기존 배열의 내용은 그대로 복사
		//마지막 방에 point를 대입
		
		pArray[0] = point;
		crtPos = crtPos + 1; //crtPos++
	}
	
	public int size() {
		return crtPos;
	}
	
	public Point get(int index) {
		return pArray[index];
	}
	
	
	
}
