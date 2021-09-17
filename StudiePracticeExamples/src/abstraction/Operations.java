package abstraction;

public class Operations {

	public static void main(String[] args) {
		
		//Shapes figura = new Shapes(5);
		//shapes é abstrata, não dá para instanciar
		
		Square quadrado = new Square(5);
		System.out.println("A area do quadrado é " + quadrado.getArea());
		
		Triangle triangulo = new Triangle(5);
		System.out.println("A area do triangulo é " + triangulo.getArea());
		
		Circle circulo = new Circle(5);
		System.out.println("A area do circulo é " + circulo.getArea());
		
		quadrado.setSide(6);
		System.out.println("A area do quadrado é " + quadrado.getArea());
		System.out.println("O lado do quadrado é " + quadrado.getSide());
		
	}

}
