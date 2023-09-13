public class Rectangle implements IShape {
	// sides of the rectangle
	private double sideA;
	private double sideB;

	public Rectangle(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public double getArea() {
		return sideA * sideB;
	}

	@Override
	public double getPerimeter() {
		return (sideA + sideB) * 2;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
}
