package LastDigit;

import java.util.*;

/*Задание 27. Создать коллекцию, наполнить случайными числами. Удалить повторяющиеся числа
*
 */
public class Task27 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>(20);
        Random random =new Random();
        for (int i=1;i<=20;i++){
            Integer mark =random.nextInt(10)+1;
            marks.add(mark);
            System.out.print(mark+" ");
        }
        System.out.println();
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(marks);
        for (Integer number:numbers){
            System.out.print(number+" ");
        }

    }
}
