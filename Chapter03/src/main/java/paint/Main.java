package paint;

public class Main {

	public static void main(String[] args) {
		Point p1 = new ColorPoint();
		p1.setX(200);
		p1.setY(100);
		((ColorPoint)p1).setColor("red");
		draw(p1);

		GraphicText gt = new GraphicText("Hello Wolrd");
		draw(gt);
	}
	
	
//	public static void drawPoint(Point point) {
//		point.show(true);
//	}
	public static void draw(Drawble drawble) {
		drawble.draw();
	}

}
