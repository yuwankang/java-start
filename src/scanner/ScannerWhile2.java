package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램 종료.");
        while (true){
            System.out.println("첫 번째 숫자를 입력하세요.");
            int num1 = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요.");
            int num2 = sc.nextInt();
            if(num1 == 0 && num2 == 0){
                System.out.println("프로그램 종료");
                break;
            }
            int sum = num1 + num2;
        }
    }
}
