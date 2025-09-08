package pattern.behavioral.interpreter;

/*
* 의도: 간단한 문법의 도메인 언어(DSL)를 해석하는 표현식 트리.
* 언제: 규칙이 빈번히 바뀌는 간단 문법.
* 장점/주의: 작은 DSL에 적합 / 복잡한 문법은 파서/컴파일러 활용 권장.
* */
public class DoInterpreter {
    public void run(){
        System.out.println("***** start 해석기 *****");
        Plus plus = new Plus(new Number(2), new Number(3));
        System.out.println(plus.interpret());
        System.out.println("***** end 해석기 *****");
    }
}
