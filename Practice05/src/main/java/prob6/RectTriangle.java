package prob6;

public class RectTriangle extends Shape{

	public RectTriangle(double weight, double height) {
		super(weight, height);
	}

	@Override
	public double getArea() {
		return weight * height * 0.5;
	}

	@Override
	public double getPerimeter() {
		return Math.sqrt(Math.pow(weight, 2) + Math.pow(height, 2)) + weight + height;
	}

}
