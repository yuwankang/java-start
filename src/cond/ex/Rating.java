package cond.ex;

import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rating = sc.nextInt();

        if(rating<=9){
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating<=8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if(rating<=7){
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
