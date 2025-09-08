package pattern.behavioral.strategy;

public class QuickSort implements SortStrategy {

    @Override
    public void sort(int[] arr) {
        for(int i: arr){
            System.out.println("퀵정렬"+i);
        }
    }
}
