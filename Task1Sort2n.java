package by.vital.all;

import java.util.Random;

public class Task1Sort2n {
    public static void main(String[] args) {

        int[] array = new int[12];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        
        for (int j = 0; j<array.length ;j+=2 ) {
            int minIndex = j;
            for (int i = j + 2; i < array.length; i+=2) {

                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            int obmen = array[j];
            array[j] = array[minIndex];
            array[minIndex] = obmen;
        }

        System.out.println();
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
             System.out.print(array[i]+" ");
        }

    }
}
