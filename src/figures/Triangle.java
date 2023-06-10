package figures;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("[Фігура: трикутник], [площа: " + getArea() + " кв. од.], [гіпотенуза: " + getHypotenuse() + " од.], [колір: " + getColor() + "]");
    }

    @Override
    public double getArea() {
        double area = 0.5 * base * height;
        BigDecimal roundedArea = BigDecimal.valueOf(area).setScale(2, RoundingMode.HALF_UP);
        return roundedArea.doubleValue();
    }

    public double getHypotenuse() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        BigDecimal roundedHypotenuse = BigDecimal.valueOf(hypotenuse).setScale(2, RoundingMode.HALF_UP);
        return roundedHypotenuse.doubleValue();
    }
}
