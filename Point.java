public class Point{
	private double x,y;

	public Point(double X, double Y){
		x=X;
		y=Y;
	}

  	public Point(Point p){
    		x= p.x;
    		y= p.y;
  	}

  	public double getX(){
    		return x;
  	}

  	public double getY(){
    		return y;
  	}  
	
	public double distanceTo(Point p) {
		return Math.sqrt(Math.pow((p.getX() - this.getX()), 2) + Math.pow((p.getY() - this.getY()), 2));
	}

	public double distance(Point p, Point q) {
		return Math.sqrt(Math.pow((p.getX() - q.getX()), 2) + Math.pow((p.getY() - q.getY()), 2));
	}

	public String toString(){
		return getX() + "," + getY();
	} 
}
