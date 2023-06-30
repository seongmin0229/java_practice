package prob6;

public abstract class Shape{
	protected double weight;
	protected double height;
	public Shape(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	public abstract double getArea(); 
	public abstract double getPerimeter();
}
