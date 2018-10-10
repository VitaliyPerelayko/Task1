import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Я почемуто сначала придумывал классы, кто кого будет наследовать, поля, методы. И это было моей ошибкой, я не придумал точно как всё это будет
*соотносится в главном классе. Поэтому тут всё так криво реализованно.
*
 */
public class Forest {

    public static void main(String[] args){
        List<Predstor> predstors =new ArrayList<>();  // список хищников
        List<Herbivorous> herbivorous =new ArrayList<>();  //список травоядных
        List<Omnivorous> omnivorous =new ArrayList<>();  //список всеядных
        List<List> animals =new ArrayList<>();  //список списков для всех животных

        List<Animals> deadAnimal =new ArrayList<>();  // список мёртвых животных
        List<Animals> illAnimal =new ArrayList<>();  //список больных животных
        List<Animals> otherAnimal =new ArrayList<>();  //остальные животные

        for(int i=0; i<4;i++){      // создаю животных

            predstors.add(new Predstor("Volf", "male",40000,50,50));
            predstors.add(new Predstor("Volf", "female",35000,45,50));
            predstors.add(new Predstor("Ferret", "male",2000,20,20));
            predstors.add(new Predstor("Ferret", "female",1500,16, 20));

        }

        for(int i=0; i<4;i++){

            herbivorous.add(new Herbivorous("Deer", "male",40000,50,50));
            herbivorous.add(new Herbivorous("Deer", "female",35000,45,50));
            herbivorous.add(new Herbivorous("Rabbit", "male",2000,15,10));
            herbivorous.add(new Herbivorous("Rabbit", "female",1500,15,10));

        }

        for(int i=0; i<4;i++){

            omnivorous.add(new Omnivorous("Bear", "male",300000,50,60));
            omnivorous.add(new Omnivorous("Bear", "female",250000,50,60));

        }
        //заполняем список со всеми животными
        animals.add(predstors);
        animals.add(herbivorous);
        animals.add(omnivorous);


        while (true){                                   // основная часть программы
            Scanner typed = new Scanner(System.in);     // вводим целое число
            int press = typed.nextInt();                // если ввели 0 программа прекращает работу
            if (press==0){
                break;
            }

            for (List<Animals> tipe:animals) {           // животные стареют, умирают и становятся старше на год
                for (Animals animal : tipe) {               // сначала я хотел чтобы вводился период за который мы хотим посмотреть
                    animal.setAge(animal.getAge()+1);      //  изменение состояния фауны леса, но это потянуло за собой много всяких сложностей
                    animal.setFull(false);                //на которые у меня не хватило времени

                    if (animal.getAge()>animal.getAgeOfDeath()){
                        animal.setAlive(false);
                    }
                }
            }


            for (List<Animals> tipe:animals){               //заполняем списки мёртвых и больных
                for (Animals animal:tipe){

                    if (!(animal.isAlive())){
                        deadAnimal.add(animal);
                    }else{
                        if (animal.isIll()){
                            illAnimal.add(animal);
                        }else{
                            otherAnimal.add(animal);
                        }
                    }
                }

            }
            // животные едят
            for (Herbivorous herbivorous1 : herbivorous) {
                herbivorous1.eat(herbivorous1,300,deadAnimal,illAnimal,otherAnimal);
                }

            for (Predstor predstor : predstors) {
                predstor.eat(predstor,300,deadAnimal, illAnimal,otherAnimal);
            }

            for (Omnivorous omnivorous1 : omnivorous) {
                omnivorous1.eat(omnivorous1,300,deadAnimal, illAnimal,otherAnimal);
            }
            // очищаем списки мёртвых и больных
            deadAnimal.clear();
            illAnimal.clear();
            otherAnimal.clear();
            //выводим состояние фауны
            System.out.println("Name       Age      Alive     Ill");
            System.out.println("=================================");
            for (List<Animals> tipe:animals) {
                for (Animals animal : tipe) {
                    System.out.println(animal.getName() + "  " + animal.getAge() + "  " + animal.isAlive() + "  " + animal.isIll());
                }
            }

        }

    }
}
