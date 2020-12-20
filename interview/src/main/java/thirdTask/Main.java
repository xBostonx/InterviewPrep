package thirdTask;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Circle();
        Figure figure2 = new Square();
        Figure figure3 = new Triangle();
        List<Figure> figures = Arrays.asList(figure1, figure2, figure3);
        figures.forEach(Figure::printName);
    }
}
