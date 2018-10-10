import java.time.Period;
import java.util.List;

public class Predstor extends Animals{

    public Predstor(String name, String sex, int weight, int spead, double ageOfDeath){
        setName(name);
        setSex(sex);
        setWeight(weight);
        setSpeed(spead);
        setAgeOfDeath(ageOfDeath);
       // setPeriodOfSatiety(periodOfSatiety);
    }


    //метод питания хищников
            public void eat(Animals predstor,double quantityOfFood, List<Animals> deadAnuimals, List<Animals> illAnimals, List<Animals> otherAnimals){
        double correction;
        if (predstor.isIll()){                         // если хищник болен его шанс поймать добычу меньше на 0,2
            correction =-0.2;
        } else{
            correction = 0;
        }
        double mass=0;                                 // масса съеденого

        for (Animals deadAnuimal:deadAnuimals ){         // сначала хищник поедает мёртвых животных
            mass+=deadAnuimal.getWeight();
            deadAnuimals.remove(deadAnuimal);
            if (mass>0.5*predstor.getWeight()){
                predstor.setFull(true);
                predstor.setIll(false);
                break;
            }
        }

        if (predstor.isFull()) return;                // если хищник наелся метод завершается

        for(Animals illAnimal:illAnimals){               // затем хищник охотится на больных животных
            double chanse = (predstor.getSpeed()-illAnimal.getSpeed())*0.1+Math.random()+0.2+correction;    // шанс поймать добычу зависит от
            if (chanse>0.8){                                                                                // удачи, скоростей хищника и добычм,
                mass+=illAnimal.getWeight();                                                                // сотояния здоровья
                illAnimals.remove(illAnimal);
            }
            if (mass>0.5*predstor.getWeight()){
                predstor.setFull(true);
                predstor.setIll(false);
                break;
            }
        }

        if (predstor.isFull()) return;

        for(Animals otherAnimal:otherAnimals){             //в конце хищник пытается поймать здоровых животных
            double chanse = (predstor.getSpeed()-otherAnimal.getSpeed())*0.1+Math.random()+correction;
            if (chanse>0.8){
                mass+=otherAnimal.getWeight();
                illAnimals.remove(otherAnimal);
            }
            if (mass>0.5*predstor.getWeight()){
                predstor.setFull(true);
                predstor.setIll(false);
                break;
            }
        }

        if (predstor.isFull()) {                                            //если хищник был болен и не наелся, он умрёт
            return;
        }else{
            if (predstor.isIll()){
                predstor.setAlive(false);
            }else{
                predstor.setIll(true);
            }
        }

    }
}
