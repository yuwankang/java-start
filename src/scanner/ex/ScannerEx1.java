package scanner.ex;

import javax.swing.text.Style;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요:");
        String name = sc.nextLine();

        System.out.println("당신의 나이를 입력하세요:");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 "+name+"이고, 나이는"+age+"살 입니다.");
    }
}
