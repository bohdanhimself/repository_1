package figures;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("[Фігура: коло], [площа: " + getArea() + " кв. од.], [радіус: " + radius + " од.], [колір: " + getColor() + "]");
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        BigDecimal roundedArea = BigDecimal.valueOf(area).setScale(2, RoundingMode.HALF_UP);
        return roundedArea.doubleValue();
    }

    public double getRadius() { return radius; }
}
