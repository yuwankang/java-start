package method;

public class MethodValue0 {
    public static void main(String[] args) {
        //자바는 항상 변수의 값을 복사해서 대입한다.
        int num1 = 5;
        int num2 = num1;
        num2 = 10;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);

    }
}
