package figures;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Trapezoid extends Figure {
    private double upperBase;
    private double lowerBase;
    private double height;

    public Trapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("[Фігура: трапеція], [площа: " + getArea() + " кв. од.], [верхня основа: " + upperBase + " од.], [нижня основа: " + lowerBase + " од.], [висота: " + height + " од.], [колір: " + getColor() + "]");
    }

    @Override
    public double getArea() {
        double area = 0.5 * (upperBase + lowerBase) * height;
        BigDecimal roundedArea = BigDecimal.valueOf(area).setScale(2, RoundingMode.HALF_UP);
        return roundedArea.doubleValue();
    }

    public double getUpperBase() { return upperBase; }

    public double getLowerBase() { return lowerBase; }

    public double getHeight() { return height; }
}
