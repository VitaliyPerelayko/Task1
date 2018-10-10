import java.time.Period;
import java.util.List;

public class Omnivorous extends Animals {

    public Omnivorous(String name, String sex, int weight, int spead, double ageOfDeath){
        setName(name);
        setSex(sex);
        setWeight(weight);
        setSpeed(spead);
        setAgeOfDeath(ageOfDeath);
     //   setPeriodOfSatiety(periodOfSatiety);
    }

    //метод питания всеядного
    public void eat(Animals omnivorous, double quantityOfFood, List<Animals> deadAnuimals, List<Animals> illAnimals, List<Animals> otherAnimals ) {
        if (quantityOfFood > 0.4 * omnivorous.getWeight()) {
            omnivorous.setIll(false);
            omnivorous.setFull(true);
            quantityOfFood -= 0.4 * omnivorous.getWeight();                   // они должны съесть 0,4 массы своего тела
        }
        if (omnivorous.isFull()) return;                // если всеядное наелся метод завершается

        double correction;
        if (omnivorous.isIll()){                         // если всеядное болен его шанс поймать добычу меньше на 0,2
            correction =-0.2;
        } else{
            correction = 0;
        }
        double mass=0;                                 // масса съеденого

        for (Animals deadAnuimal:deadAnuimals ){         // сначала всеядное поедает мёртвых животных
            mass+=deadAnuimal.getWeight();
            deadAnuimals.remove(deadAnuimal);
            if (mass>0.4*omnivorous.getWeight()){
                omnivorous.setFull(true);
                omnivorous.setIll(false);
                break;
            }
        }

        if (omnivorous.isFull()) return;                // если всеядное наелся метод завершается

        for(Animals illAnimal:illAnimals){               // затем всеядное охотится на больных животных
            double chanse = (omnivorous.getSpeed()-illAnimal.getSpeed())*0.1+Math.random()+0.2+correction;    // шанс поймать добычу зависит от
            if (chanse>0.8){                                                                                // удачи, скоростей всеядноеа и добычм,
                mass+=illAnimal.getWeight();                                                                // сотояния здоровья
                illAnimals.remove(illAnimal);
            }
            if (mass>0.4*omnivorous.getWeight()){
                omnivorous.setFull(true);
                omnivorous.setIll(false);
                break;
            }
        }

        if (omnivorous.isFull()) return;

        for(Animals otherAnimal:otherAnimals){             //в конце всеядное пытается поймать здоровых животных
            double chanse = (omnivorous.getSpeed()-otherAnimal.getSpeed())*0.1+Math.random()+correction;
            if (chanse>0.8){
                mass+=otherAnimal.getWeight();
                illAnimals.remove(otherAnimal);
            }
            if (mass>0.4*omnivorous.getWeight()){
                omnivorous.setFull(true);
                omnivorous.setIll(false);
                break;
            }
        }

        if (omnivorous.isFull()) {                        //если всеядное был болен и не наелся, он умрёт
            return;
        }else{
            if (omnivorous.isIll()){
                omnivorous.setAlive(false);
            }else{
                omnivorous.setIll(true);
            }
        }
    }
}
