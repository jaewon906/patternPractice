package pattern.behavioral.strategy;

public class Context {
    SortStrategy sortStrategy;

    Context(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    void execute(int[] arr){
        this.sortStrategy.sort(arr);
    }
}
