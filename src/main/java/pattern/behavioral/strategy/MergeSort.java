package pattern.behavioral.strategy;

public class MergeSort implements SortStrategy {

    @Override
    public void sort(int[] arr) {
        for(int i: arr){
            System.out.println("병합정렬"+i);
        }
    }
}
