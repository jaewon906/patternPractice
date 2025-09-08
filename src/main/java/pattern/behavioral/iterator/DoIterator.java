package pattern.behavioral.iterator;

/*
* 의도: 내부 표현을 노출하지 않고 순회 방법 제공.
* 언제: 컬렉션 순회 표준화.
* 장점/주의: 일관된 API / 동시 수정(ConcurrentModification) 주의.
*/

import java.util.Iterator;

public class DoIterator {
    public void run(){
        System.out.println("***** start 이터레이터 *****");
        Iterator<String> itr = new MyCollection().iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("***** end 이터레이터 *****");
    }
}
