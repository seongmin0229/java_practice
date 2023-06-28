package paint;

public class ColorPoint extends Point{
	String color;
	
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void show() {
		System.out.println("점[x=" + this.getX() + ", y=" + this.getY() + ", color=" + color + "]을 그렸습니다.");
	}
}