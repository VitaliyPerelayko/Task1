package LastDigit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*Задание 26. Создать список оценок учеников с помощью ArrayList,заполнить случайными оценками.
*Найти самую высокую оценку с использованием итератора.
 */
public class Task28 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>(20);
        Random random =new Random();
        for (int i=1;i<=20;i++){
            Integer mark =random.nextInt(10)+1;
            marks.add(mark);
            System.out.print(mark+" ");
        }
        System.out.println();
        Iterator<Integer> iterator =marks.iterator();
        Integer max = iterator.next();
        while (iterator.hasNext()){
            Integer temp = iterator.next();
            if (temp>max){
                max=temp;
            }
        }
        System.out.println(max);

    }
}
