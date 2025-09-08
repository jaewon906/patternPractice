package pattern.behavioral.templateMethod;

public abstract class Game {
    final void play(){
        init();
        start();
        end();
    }
    abstract void init();
    abstract void start();
    abstract void end();
}
