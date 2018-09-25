package SorryIAmLate;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

    int examHours;
    int examMinute;
    int studentHours;
    int studentMinute;
    int diferense;

    Scanner youEnter = new Scanner(System.in);
    System.out.println("Type the time of exam ");
        do {
            System.out.println("Type the number of hours from 0 to 23");
            examHours=youEnter.nextInt();
        } while((examHours<0)||(examHours>23));
        do {
            System.out.println("Type the number of minute from 0 to 59");
            examMinute=youEnter.nextInt();
        } while((examMinute<0)||(examMinute>59));
    System.out.println("Type the time when the student arrived");
        do {
            System.out.println("Type the number of hours from 0 to 23");
            studentHours=youEnter.nextInt();
        } while((studentHours<0)||(studentHours>23));
        do {
            System.out.println("Type the number of minute from 0 to 59");
            studentMinute=youEnter.nextInt();
        } while((studentMinute<0)||(studentMinute>59));

     diferense=(studentHours*60+studentMinute)-(examHours*60+examMinute);

     if (diferense<-30)
         System.out.println("The student arrived "+(-diferense/60)+" hours "+(-diferense%60)+" minutes earlier ");
     if ((diferense>=-30)&&(diferense<=0))
         System.out.println("The student arrived on time");
     if (diferense>0)
         System.out.println("The student is "+(diferense/60)+" hours "+(diferense%60)+" minutes late ");
    }
}
