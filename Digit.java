package LastDigit;

import java.util.Scanner;

public class Digit {
    public static void main(String [] args){

        int yourNumber;

        Scanner youTyped = new Scanner(System.in);
        System.out.println("Type your number");
        yourNumber = youTyped.nextInt();
        if (yourNumber%10==7) System.out.println("Yes, last digit is 7");
        else System.out.println("No, last digit is "+yourNumber%10);
    }
}
