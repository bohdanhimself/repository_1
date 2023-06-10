package figures;
public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double getArea();

    public String getColor() {
        return color;
    }
}
