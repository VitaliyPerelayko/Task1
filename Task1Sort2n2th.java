package circleRectangle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1Sort2n2th {
    public static void main(String[] args) {

        int[] array = new int[20];
        int[] sort = new int[(array.length+1)/2];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        for(int i=0;i<sort.length ;i++){    // new array which include only 2*i elements
            sort[i]=array[i*2];
        }
        Arrays.sort(sort);

        for(int i=0;i<sort.length ;i++) {    // put back sorted array
            array[i * 2] = sort[i];
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
