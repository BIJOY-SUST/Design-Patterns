import java.lang.reflect.Constructor;

/**
 * Air_Conditioner
 */
public class Air_Conditioner implements Command{
    boolean flag = false;
    String Name;
    Air_Conditioner(String Name, Remote remote, int ind) {
        this.Name = Name;
        remote.allDevice.add(ind, this);
    }

    @Override
    public void on() {
        if(flag){
            System.err.println("Air Conditioner is already on..!");
        }
        else{
            System.err.println("Air Conditioner is on..!");
            flag=true;
        }
    }

    @Override
    public void off() {
        if (!flag) {
            System.err.println("Air Conditioner is already off..!");
        } else {
            System.err.println("Air Conditioner is off..!");
            flag = false;
        }
    }
    
}