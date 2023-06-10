package figures;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends Figure {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("[Фігура: квадрат], [площа: " + getArea() + " кв. од.], [довжина сторони: " + sideLength + " од.], [колір: " + getColor() + "]");
    }

    @Override
    public double getArea() {
        double area = sideLength * sideLength;
        BigDecimal roundedArea = BigDecimal.valueOf(area).setScale(2, RoundingMode.HALF_UP);
        return roundedArea.doubleValue();
    }
}
