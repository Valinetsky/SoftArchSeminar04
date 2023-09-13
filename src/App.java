public class App {
	public static void main(String[] args) {
		GeometryFigure figureBox = new GeometryFigure();
		Circle circle1 = new Circle(10);
		Triangle tri1 = new Triangle(3, 4, 5);
		Triangle tri2 = new Triangle(1.5, 2, 2.5);
		Triangle tri3 = new Triangle(3, 3, 3);
		Rectangle rec1 = new Rectangle(5, 10);
		figureBox.add(circle1);
		figureBox.add(tri1);
		figureBox.add(tri2);
		figureBox.add(tri3);
		figureBox.add(rec1);

		System.out.println("Список фигур:");
		for (int i = 0; i < figureBox.getSize(); i++) {
			figureBox.getInfo(i);
		}

		System.out.println();

		System.out.println("Удаление первого треугольника figureBox.delete(tri1)");
		figureBox.delete(tri1);

		System.out.println();

		System.out.println("Список фигур:");
		for (int i = 0; i < figureBox.getSize(); i++) {
			figureBox.getInfo(i);
		}

		System.out.println();

		System.out.printf("figureBox.find(rec1)%nИндекс фигуры: %d.", figureBox.find(rec1));

	}

}