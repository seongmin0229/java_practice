package com.bitacademy.paint.main;

import com.bitacademy.paint.i.Drawable;
import com.bitacademy.paint.point.*;
import com.bitacademy.paint.shape.*;
import com.bitacademy.paint.text.GraphicText;
//import com.bitacademy.paint.*;

public class Main {
	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(50);
		// drawPoint(point1);
		draw(point1);
		point1.show(false);
		
		Point point2 = new Point(200, 150);
		// drawPoint(point2);
		draw(point2);
		point2.show(false);
		
//		Point point3 = new ColorPoint();
//		point3.setX(200);
//		point3.setY(100);
		Point point3 = new ColorPoint(200, 100, "red");
		point3.setX(200);
		point3.setY(100);
		((ColorPoint)point3).setColor("red");
		// drawPoint(point3);
		draw(point3);
		
		Rectangle rectangle = new Rectangle();
		// drawRectangle(rectangle);
		// drawShape(rectangle);
		draw(rectangle);
		
		Triangle triangle = new Triangle();
		// drawTriangle(triangle);
		// drawShape(triangle);
		draw(triangle);
		
		Circle circle = new Circle();
		// drawShape(circle);
		draw(circle);
		
		GraphicText gt = new GraphicText("Hello World");
		draw(gt);
		
		// instanceof test
		System.out.println(circle instanceof Circle);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Drawable);
		
		// 오류 : class는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다.
		// System.out.println(circle instanceof Rectangle);
		
		//하지만, interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
		
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawPoint(Point point) {
//		point.show(true);
//	}

//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
	
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
//
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
	
//	public static void drawColorPoint(ColoPoint colorPoint) {
//		colorPoint.show();
//	}	
}