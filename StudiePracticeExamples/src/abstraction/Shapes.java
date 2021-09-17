package abstraction;

public abstract class Shapes {

	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public abstract double getArea();

	public Shapes(double side) {
		this.side = side;
	}

}

class Circle extends Shapes {

	public Circle(double side) {
		super(side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {

		return 3.141592 * getSide() * getSide();
	}

}

class Triangle extends Shapes {

	public Triangle(double side) {
		super(side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return getSide() * getSide() / 2;
	}

}

class Square extends Shapes {

	public Square(double side) {
		super(side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return getSide() * getSide();
	}

}
