import java.time.Period;
import java.util.List;

public class StateOverTime {

    private boolean alive = true;         // жив или нет

    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    private double age=0;                //возраст животного

    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

    /*private boolean pregnancy=false;             //беременно животное или нет

    public boolean isPregnancy() {
        return pregnancy;
    }
    public void setPregnancy(boolean pregnancy) {
        this.pregnancy = pregnancy;
    }

    private double periodOfGestation;            // период вынашивания

    public double getPeriodOfGestation() {
        return periodOfGestation;
    }
    public void setPeriodOfGestation(double periodOfGestation) {
        this.periodOfGestation = periodOfGestation;
    }

    private double ageOfPuberty;             //возраст половозрелости

    public double getAgeOfPuberty() {
        return ageOfPuberty;
    }
    public void setAgeOfPuberty(double ageOfPuberty) { this.ageOfPuberty=ageOfPuberty;
    }*/

   /* private double periodOfSatiety;                   //Период сытости

    public double getPeriodOfSatiety() {
        return periodOfSatiety;
    }
    public void setPeriodOfSatiety(double periodOfSatiety) {
        this.periodOfSatiety = periodOfSatiety;
    }*/

    private boolean full=true;       // Сыт или нет

    public boolean isFull() {
        return full;
    }
    public void setFull(boolean full) {
        this.full = full;
    }

    /*public void stateOverTime(double period, List<StateOverTime> allAnimals){                    // изменение параметров животных (жив,беременная,сытый)
        for (StateOverTime animal:allAnimals ){
            animal.setAge(animal.getAge()+period);
            //animal.setPeriodOfGestation(animal.getPeriodOfGestation().minus(period));         // пока не знаю как реализовать размножение
            if (animal.getAge()>ageOfDeath){
                animal.setAlive(false);
            }
            if (periodOfSatiety<period){
                animal.setFull(false);
            }
            if ((animal.isPregnancy())&&(animal.getPeriodOfGestation()==0)){
                animal.setPregnancy(false);
                allAnimals.add(animal);
            }
        }

    }*/
}
