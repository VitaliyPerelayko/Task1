package by.vital.all;

public class Task3Sun {
    public static void main(String[] args) {
        int number = 65678678;
        int forPrint =number;
        int sum=0;
        while (number>0){
            sum += number%10;
            number /=10;
        }
        System.out.println("Sum digits of number "+forPrint+" = "+sum);
    }
}
