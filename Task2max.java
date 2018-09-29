package by.vital.all;
import sun.swing.plaf.synth.SynthFileChooserUI;
import useless.Useless;
import java.util.SimpleTimeZone;

public class Task2max {

    public static void main(String [] args){

        int [][] array = new int[5][5];

        for (int i=0;i<array.length;i++){
            for( int j=0;j<array[i].length;j++){
                array[i][j]=(int)(Math.random()*100);
            }
        }

        int max=array[0][0];

        for (int i=0;i<array.length;i++){
            for( int j=0;j<array[i].length;j++){
                if (array[i][j]>max) {max=array[i][j];}
            }
        }

        for (int i=0;i<array.length;i++){
            for( int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Max element="+max);

    }
}
