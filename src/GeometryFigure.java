import java.util.ArrayList;
import java.util.List;

public class GeometryFigure {

	static private List<IShape> toolbox;

	public GeometryFigure() {
		toolbox = new ArrayList<IShape>();
	}

	// Метод для добавления новой фигуры
	public void add(IShape figure) {
		toolbox.add(figure);
	}

	// Метод для удаления фигуры
	public void delete(IShape figure) {
		toolbox.remove(figure);
	}

	// Метод поиска необходимой фигуры
	public int find(IShape figure) {
		return toolbox.indexOf(figure);
	}

	// Метод отображения подробной информации о фигуре
	public void getInfo(int num) {
		if (num >= 0 & num < toolbox.size()) {
			IShape figure = toolbox.get(num);
			System.out.printf("Shape: %s. Area: %f. Perimeter: %f.%n", figure.getClass().getSimpleName(),
					figure.getArea(),
					figure.getPerimeter());
		}
	}

	// Метод получения размера хранилища
	public int getSize() {
		return toolbox.size();
	}
}
