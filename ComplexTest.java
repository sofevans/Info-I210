import java.util.Scanner;

/**Template to Check Code from Pearson*/
public class Exercise13_17 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first complex number: ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    Complex c1 = new Complex(a, b);

    System.out.print("Enter the second complex number: ");
    double c = input.nextDouble();
    double d = input.nextDouble();
    Complex c2 = new Complex(c, d);

    System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
    System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
    System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
    System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
    System.out.println("|" + c1 + "| = " + c1.abs());
    
    Complex c3 = (Complex)c1.clone();
    System.out.println(c1 == c3);
    System.out.println(c3.getRealPart());
    System.out.println(c3.getImaginaryPart());
    Complex c4 = new Complex(4, -0.5);
    Complex[] list = {c1, c2, c3, c4};
    java.util.Arrays.sort(list);
    System.out.println(java.util.Arrays.toString(list));
  }
}
/**Code for Exercise*/
public class Complex implements Cloneable {
	private double a;
	private double b;
	public Complex() {
		this(0, 0);
	}
	public Complex(double a) {
		this(a, 0);
	}
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double getRealPart() {
		return a;
	}
	public double getImaginaryPart() {
		return b;
	}
	public add(Complex secondComplex) {
		return new Complex(a + secondComplex.a, 
			b + secondComplex.b); 
	}

	public subtract(Complex secondComplex) {
		return new Complex(a - secondComplex.a,
			b - secondComplex.b);
	}
	public multiply(Complex secondComplex) {
		return new Complex(a * secondComplex.a - b * secondComplex.b,
			b * secondComplex.a + a * secondComplex.b);
	}

	public divide(Complex secondComplex) {
		return new Complex((a * secondComplex.a + b * secondComplex.b) /
			(Math.pow(secondComplex.a, 2) + Math.pow(secondComplex.b, 2)),
			(b * secondComplex.a - a * secondComplex.b) /
			(Math.pow(secondComplex.a, 2) +  Math.pow(secondComplex.b, 2)));
	}

	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    
	}

	@Override
	public Complex clone() throws CloneNotSupportedException {
		return (Complex)super.clone();
	}

	@Override
	public String toString() {
		if (b == 0) 
      return a;
    else
      return "(" + a + " + " + b + "i")";
	}
}
