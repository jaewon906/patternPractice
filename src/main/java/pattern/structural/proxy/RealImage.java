package pattern.structural.proxy;

public class RealImage implements Image {
    @Override
    public void display() {
        System.out.println("realImage");
    }
}
