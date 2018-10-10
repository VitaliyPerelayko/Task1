import java.time.Period;
import java.util.List;

public class Herbivorous extends Animals {

    public Herbivorous(String name, String sex, int weight, int spead, double ageOfDeath){
        setName(name);
        setSex(sex);
        setWeight(weight);
        setSpeed(spead);
        setAgeOfDeath(ageOfDeath);
      //  setPeriodOfSatiety(periodOfSatiety);
    }

        //метод питания травоядных
    public void eat(Herbivorous herbivorous,double quantityOfFood, List<Animals> deadAnuimals, List<Animals> illAnimals, List<Animals> otherAnimals){
        if (quantityOfFood>0.3*herbivorous.getWeight()){
            herbivorous.setIll(false);
            herbivorous.setFull(true);
            quantityOfFood -=0.3*herbivorous.getWeight();                   // они должны съесть 0,3 массы своего тела
        }else {
            if (herbivorous.isIll()){                                       // если животное не наелось и оно больно оно умирает
                herbivorous.setAlive(false);
            }else {
                herbivorous.setIll(true);                                   // а если здорово, оно заболевает
            }
        }
    }
}
