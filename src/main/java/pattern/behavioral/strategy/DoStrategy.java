package pattern.behavioral.strategy;

/**
 * 의도: 알고리즘을 인터페이스로 추상화, 런타임 교체.
 * 언제: 정렬/압축/경로/요금 등 교체 가능한 정책.
 * 장점/주의: 유연 / 전략 선택 로직은 여전히 필요.
*/
public class DoStrategy {
    public void run(){
        System.out.println("***** start 전략 *****");
        Context c1 = new Context(new MergeSort());
        c1.execute(new int[]{1});

        Context c2 = new Context(new QuickSort());
        c2.execute(new int[]{1,2});
        System.out.println("***** end 전략 *****");
    }
}
