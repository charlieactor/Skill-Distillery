package com.skilldistillery.web;

public class Ball {
	private int num;

	public String getNum() {
		return Integer.toString(num);
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Ball [num=" + num + "]";
	}

	public Ball(int num) {
		super();
		this.num = num;
	}
	
	

}
