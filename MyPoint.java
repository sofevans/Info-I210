public class MyPoint {
    // Data fields
    private double x;
    private double y;
    
    MyPoint() { // Creates specific point (0,0)
        x = 0;
        y = 0;
    }
    MyPoint(double x, double y) { // Construct specified coordinates
	this.x = x;
	this.y = y;
    }
    public double getX(){ // getter method for x
        return x;
    }
    public void setX() {
        this.x = x;
    }
    public double getY() { // getter method for x
        return y;
    }
    public void setY() {
        this.y = y;
    }
    
    public double distance(double x2, double y2) {
        double X = Math.pow((this.x - x2),2);
        double Y = Math.pow((this.y - y2),2);
        double d = Math.sqrt(X + Y);
        return d;
    }
    public double distance(MyPoint1, MyPoint2) {
        double X = Math.pow((MyPoint1.getX() - MyPoint2.getX()),2);
        double Y = Math.pow((MyPoint1.getY() - MyPoint2.getY()),2);
        double d = Math.sqrt(X + Y);
        return d;
    }
}
