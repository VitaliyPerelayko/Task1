package by.vital.all;

public class Task5Faktorial {
    public static void main(String[] args) {
        int number = 15;
        long sum=1L;

        for (int i=1;i<=number;i++ ){
            sum=sum*i;
        }
        System.out.println(number+"!="+sum);
    }
}
