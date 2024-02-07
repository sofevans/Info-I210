public class MyRectangle2D {
    // (x,y) is the center of the rectangle
    double x;
    double y;
    double width;
    double height;
    
    MyRectangle2D() {
        this(0, 0, 1, 1);
    }
    
    MyRectangle2D(double x, double y, double height, double width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
    
    public double getX() {
        return x;
    }
    public void setX() {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY() {
        this.y = y;
    }
     public double getHeight() {
        return height;
    }
    public void setHeight() {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWideth() {
        this.width = width;
    }
    public double getArea(){
        double Area = (width * height);
        return Area;
    }
    public double getPerimeter() {
        double perimeter = 2 * (width + height);
        return perimeter;
    }
    public boolean contains(double x, double y) {
        double w1 = 0 - (width / 2.0);
        double w2 = 0 + (width / 2.0);
        double h1 = 0 - (height / 2.0);
        double h2 = 0 + (height / 2.0);
        boolean i;
        if (x >= w1 && x <= w2){
            if (y >= h1 && y <= h2) {
            }
        }
        return true;
    }
    public boolean contains(MyRectangle2D r) {
        double w1 = 0 - (width / 2.0);
        double w2 = 0 + (width / 2.0);
        double h1 = 0 - (height / 2.0);
        double h2 = 0 + (height / 2.0);
        
        double w3 = 0 - (r.getWidth() / 2.0);
        double w4 = 0 + (r.getWidth() / 2.0);
        double h3 = 0 - (r.getHeight() / 2.0);
        double h4 = 0 + (r.getHeight() / 2.0);
   
        if (w3 >= w1 && w4 <= w2){
            if (h3 >= h1 && h4 <= h2) {
            }
        }
        return true;
    }
    
    public boolean overlaps(MyRectangle2D r){
        double w1 = 0 - (width / 2.0);
        double w2 = 0 + (width / 2.0);
        double h1 = 0 - (height / 2.0);
        double h2 = 0 + (height / 2.0);
        
        double w3 = 0 - (r.getWidth() / 2.0);
        double w4 = 0 + (r.getWidth() / 2.0);
        double h3 = 0 - (r.getHeight() / 2.0);
        double h4 = 0 + (r.getHeight() / 2.0);
   
        if (w3 >= w1 || w4 <= w2){
            if (h3 >= h1 || h4 <= h2) {
            }
        }
        return true;
    }
}
