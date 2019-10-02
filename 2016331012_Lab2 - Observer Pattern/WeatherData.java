import java.util.ArrayList;
import java.util.Random;

/**
 * WeatherData
 */
public class WeatherData implements Subject{

    ArrayList<Observer> array_obj = new ArrayList<>();
    @Override
    public void addObserver(Observer obj) {
        array_obj.add(obj);
        System.out.println("New Sensor Added!");
    }
    @Override
    public void removeObserver(Observer obj) {
        int check=-1;
        Observer tempo;
        for(int i=0;i<array_obj.size();i++){
            tempo = array_obj.get(i);
            if(tempo.equals(obj)){
                // array_obj.remove(obj);
                // System.out.println("Remove Sensor!");
                check = i;
                break;
            }
        }
        if(check != -1){
            array_obj.remove(check);
            System.out.println("Remove Sensor!");

        }
        // System.out.println("Remove Sensor completed!");

    }
    @Override
    public void notifyObservers(Observer obj) {
            obj.update();
    }

    static public int getTem() {
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        int rand_int = rand.nextInt(1000);
        return rand_int;
    }    

    static public int getHumidity() {
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        int rand_int = rand.nextInt(1000);
        return rand_int;
    }    
    
    static public int getPressure() {
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        int rand_int = rand.nextInt(1000);
        return rand_int;
    }


    public void measurementsChanged() {
        for (Observer tempo : array_obj) {
            notifyObservers(tempo);
        }
    }

}