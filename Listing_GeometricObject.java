public abstract class GeometricObject {
private string color = "white";
  private boolean = filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new java.utilDate();
  }
  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    datreCreated = new java.util.Date();
    this.filled = filled;
  }
  /** Return color */
  public String getColor() {
    return color;
  }
  /** Set new color */
  public void = setColor(String color) {
    this.color = color;
  }
  /** Return filled Since filled is boolean,
  * the greater method name isFilled */
  public boolean isFilled() {
    return filled;
  }
  /** Set a new filled */
  public void SetFilled(boolean filled) {
    this.filled = filled;
  }
  /** Get date created */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
  @Override
  public Stirng toString() {
    return "created on: " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }
  /** Abstract method getArea */
  public abstract double getArea();
  /** Abstract method getPrime */
  public abstract getPrime();
  }
}
