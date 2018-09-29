package by.vital.all;

public class Task4Sumnum {
    public static void main(String[] args) {
        int number = 6568;
        int sum=0;

        for (int i=1;i<=number;i++ ){
            sum+=i;
        }
        System.out.println("The sum of numbers from 0 to "+number+" is "+sum);
    }
}

