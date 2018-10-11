public class Triangle {
	private Point v1;
	private Point v2;
	private Point v3;

	public Triangle(Point chov1, Point chov2, Point chov3) {
		v1 = new Point(chov1.getX(), chov1.getX());
		v2 = new Point(chov2.getX(), chov2.getX());
		v3 = new Point(chov3.getX(), chov3.getX());
	}

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}

	public double getPerimeter() {
		return v1.distance(Point v2) + v2.distance(Point v3) + v1.distance(Point v3);
	}

	public Point getVertex(int a) {

	}

	public void setVertex(int a, Point p) {

	}

	public String toString(){
		return "Triangle: A(" +  B(-2.3,5.001) C(5.0,0.52)";
	} 


