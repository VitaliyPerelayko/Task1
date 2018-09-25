package circleRectangle;

import java.util.Scanner;

public class CirklePectangle {
    public static void main(String [] args){
        int radius,a,b;

        Scanner youTeped = new Scanner(System.in);

        System.out.println("Type the length a");
        a=youTeped.nextInt();
        System.out.println("Type the width b");
        b=youTeped.nextInt();
        System.out.println("Type the radius");
        radius=youTeped.nextInt();

        if (a*a+b*b<=4*radius*radius)
            System.out.println("Yes, it will");
        else
            System.out.println("No it won't ");


    }
}
