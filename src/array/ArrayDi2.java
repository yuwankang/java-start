package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; //행2, 열3

        arr[0][0] = 1;// 0행 0열
        arr[0][1] = 2;// 0행 0열
        arr[0][2] = 3;// 0행 0열
        arr[1][0] = 4;// 0행 0열
        arr[1][1] = 5;// 0행 0열
        arr[1][2] = 6;// 0행 0열


        for(int row =0; row<2; row++){
            for(int colum = 0; colum <3; colum++){
                System.out.print(arr[row][colum]+" ");
            }
            System.out.println();
        }
    }
}
