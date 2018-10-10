import java.sql.Array;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public  class Animals extends StateOverTime {

    private  String name;         //вид животног

    public void setName(String name){this.name=name;}
    public String getName() { return name; }

    private  String sex;                 //пол животного

    public void setSex(String sex) { this.sex = sex; }
    public String getSex() { return sex; }

    private double  ageOfDeath;           //длительность жизни

    public void setAgeOfDeath(double ageOfDeath) { this.ageOfDeath = ageOfDeath; }
    public double getAgeOfDeath() {  return ageOfDeath;}

    private boolean ill=false;         // болен или нет

    public boolean isIll() {
        return ill;
    }
    public void setIll(boolean ill) {
        this.ill = ill;
    }

    private int weight;              //масса животного

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int speed;                      // скорость передвижения

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

  /*  public static void stateOverTime( ArrayList<Animals> animals){                    // изменение параметров животных (жив,сытый)

            for (Animals animal:animals){
                animal.setAge(animal.getAge()+1);
                animal.setFull(false);

                if (animal.getAge()>animal.getAgeOfDeath()){
                    animal.setAlive(false);
                }
            }


        }*/
/*   Изменений очень мало, потомучто не успел, не смог реализовать. Должно было ещё быть размножение, рождение, разные животные могут обходится без еды различное время
*
* */


}


