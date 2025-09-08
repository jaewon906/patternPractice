package pattern.creational.factory;

public class CreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new concreateProductA();
    }
}
