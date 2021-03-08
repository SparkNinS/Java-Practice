package Arrays;
import java.util.Scanner;
public class Array2 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        System.out.print("Please enter 6 digits here : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("The sum of the digits = " + sum);
        double avg = sum / number.length;
        System.out.println("The average is : " + avg);
        double max = number[0];
        double min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Maximum value is = " + max);
        System.out.println("minimum value is = " + min);
    }
}
