package pattern.structural.bridge;

public class Circle extends Shape{

    Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(color.fillColor() + " 원");
    }
}
