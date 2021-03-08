package Arrays;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[6];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        number[5] = 60;
        int len = number.length;
        System.out.println("Size of the array = "+len);
        int sum = number[0] + number[1] + number[2] + number[3];
        System.out.println("Sum of 1st 4 values = "+sum);
    }
}