package LastDigit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Задание 26. Создать список оценок учеников с помощью ArrayList,заполнить случайными оценками.
*Yдалить неудовлетворительные  оценки из списка.
 */
public class Task26 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>(20);
        Random random =new Random();
        for (int i=1;i<=20;i++){
            Integer mark =random.nextInt(10)+1;
            marks.add(mark);
            System.out.print(mark+" ");
        }
        System.out.println();
        marks.removeIf(a->a<4);  //Это я не списал, самые простые примеры лямбда выражений в книжке OSA описаны =)
        for (Integer mark:marks){
            System.out.print(mark+" ");
        }
    }
}
