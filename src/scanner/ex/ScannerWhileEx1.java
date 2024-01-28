package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("이름을 입력하세요:");
            String name = sc.nextLine();

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("나이를 입력하세요:");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("입력한 이름: "+name+", 나이: "+age);
        }
    }
}
