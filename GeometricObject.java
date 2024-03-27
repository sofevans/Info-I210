public abstract class GeometricObject implements Comparable<GeometricObject> {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /**Default construct*/
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /**Construct a geometric object*/
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** return color*/
  public String getColor() {
    return color;
  }
    /**Set new color*/
  public void setColor(String color) {
    this.color = color;
  }
  
  /**Return filled. Since filled is boolean,
     the get method name is isFilled*/
  public boolean isFilled() {
    return filled;
  }
  /**Set filled*/
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
/** Get dateCreated */
  public java.util.Date dateCreated() {
    return dateCreated;
}
  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      "and filled: " + filled;
  }
    /**Abstract method getArea*/
  public abstract double getArea(); 
  /**Abstract method getPerimeter*/
  public abstract double getPerimeter();
}
