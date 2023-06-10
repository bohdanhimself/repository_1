import figures.*;
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            callDraw();
            System.out.println("***");
        }
    }

    private static void callDraw() {
        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(5) + 1];

        for (int i = 0; i < figures.length; i++) {
            int randomNumber = random.nextInt(4);

            switch (randomNumber) {
                case 0:
                    figures[i] = new Square(generateRandomColor(), sideLength);
                    break;
                case 1:
                    figures[i] = new Triangle(generateRandomColor(), base, height);
                    break;
                case 2:
                    figures[i] = new Circle(generateRandomColor(), radius);
                    break;
                case 3:
                    figures[i] = new Trapezoid(generateRandomColor(), upperBase, lowerBase, height);
                    break;
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }

    private static String generateRandomColor() {
        String[] colors = {"синій", "жовтий", "червоний", "зелений"};
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }

    private static double generateRandomValue(double maxValue) {
        Random random = new Random();
        double value = random.nextDouble() * maxValue;
        BigDecimal roundedValue = BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP);
        return roundedValue.doubleValue();
    }

    private static double sideLength = generateRandomValue(10.0);
    private static double base = generateRandomValue(10.0);
    private static double height = generateRandomValue(10.0);
    private static double radius = generateRandomValue(10.0);
    private static double upperBase = generateRandomValue(10.0);
    private static double lowerBase = generateRandomValue(10.0);
}
