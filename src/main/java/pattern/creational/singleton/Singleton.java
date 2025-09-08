package pattern.creational.singleton;

public class Singleton {
    static class Holder{
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return Holder.instance;
    }
}
