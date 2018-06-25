package com.ccnu.nercel.shape;

import java.awt.Point;

public class ScreenPoint extends Point{
	public int x;
	public int y;
	public ScreenPoint() {
	}
	public ScreenPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	public void rotate(int alpha) {
		double rad = (float)alpha / 180 * Math.PI;
		int x1 = x;
		int y1 = y;
		x = (int) (x1 * Math.cos(rad) - y1 * Math.sin(rad));
		y = (int) (x1 * Math.sin(rad) + y1 * Math.cos(rad));
	}

	public String toString() {
		String string = "(" + x + "," + y + ")";

		return string;
	}

}