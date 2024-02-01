package method;

public class Method1Ref {
    public static void main(String[] args) {

        int sum1 =add(5, 10);
        System.out.println("계산1 출력: "+sum1);

        System.out.println("=============");
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: "+sum2);
    }

    public static int add(int a, int b){
        System.out.println(a+"+"+b+" 연산을 수행하세요");
        int sum = a+b;
        return sum; //return문 사용해야함
    }
}
//인수 Argument = 넘기는 값을 영어로 아규먼트, 한글로는 인수 또는 인자
//매개변수 Parameter = 메서드를 정의할때 선언한 변수 매개변수, 파라미터라고 한다.

