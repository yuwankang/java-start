package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요:");
        int num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요:");
        int num2 = sc.nextInt();

        //num1 이 num2보다 큰경우 두 숫자를 교환

        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;

        }
        System.out.println("두 숫자 사이의 모든 정수:");
        for(int i = num1; i<=num2; i++){
            System.out.print(i);
            if(i != num2){
                System.out.print(",");
            }
        }

    }
}
