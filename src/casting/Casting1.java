package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long)intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = (double) intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = (double) 20L;
        System.out.println("doubleValue2 = " + doubleValue);


    }
}
