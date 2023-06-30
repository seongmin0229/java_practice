package prob6;

public class Rectangle extends Shape implements Resizable{
	
	public Rectangle(double weight, double height) {
		super(weight, height);
	}

	@Override
	public void resize(double resize) {
		height *= resize;
		weight *= resize;
	}

	@Override
	public double getArea() {
		return height * weight;
	}

	@Override
	public double getPerimeter() {
		return height * 2 + weight * 2;
	}

}
