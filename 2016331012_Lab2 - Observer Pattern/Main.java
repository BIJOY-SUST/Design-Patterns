/**
 * Main
 */
 interface Observer{
    public void update();
}

 class CurrentCondition implements Observer {
    @Override
    public void update(){
        System.out.println("-> CurrentCondition update funcion callded!");

        System.out.println("Tem : "+WeatherData.getTem());
        System.out.println("Hum : "+ WeatherData.getHumidity());
        System.out.println("Pre : "+ WeatherData.getPressure());

    }
}

 class Forecast implements Observer{
    @Override
    public void update() {
        System.out.println("-> Frecast update funcion callded!");
        System.out.println("Tem : "+WeatherData.getTem());
        System.out.println("Hum : "+WeatherData.getHumidity());
        System.out.println("Pre : "+WeatherData.getPressure());

    }
}

 class Health implements Observer{
    @Override
    public void update() {
        System.out.println("-> Health update funcion callded!");
        System.out.println("Tem : " + WeatherData.getTem());
        System.out.println("Hum : " + WeatherData.getHumidity());
        System.out.println("Pre : " + WeatherData.getPressure());
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherData wd_obj = new WeatherData();

        CurrentCondition cc = new CurrentCondition();
        Forecast fc = new Forecast();
        Health h = new Health();

        wd_obj.addObserver(cc);
        wd_obj.addObserver(fc);
        wd_obj.addObserver(h);

        System.out.println();

        wd_obj.removeObserver(fc);

        System.out.println();

        Forecast fc2 = new Forecast();
        wd_obj.addObserver(fc2);

        System.out.println();


        wd_obj.measurementsChanged();

        System.out.println();

        wd_obj.removeObserver(fc2);

        System.out.println();

        // System.out.println("hello world");

        Forecast fc3 = new Forecast();
        wd_obj.addObserver(fc3);
                
        System.out.println();

        wd_obj.measurementsChanged();

    }
}







